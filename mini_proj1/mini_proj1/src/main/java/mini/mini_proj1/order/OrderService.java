package mini.mini_proj1.order;

import mini.mini_proj1.discount.DiscountPolicy;
import mini.mini_proj1.discount.RateDiscountPolicy;
import mini.mini_proj1.member.Grade;
import mini.mini_proj1.member.Member;
import mini.mini_proj1.member.MemberService;

public class OrderService {
    private final MemberService memberService = new MemberService();
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberService.findMember(memberId);

        member.increaseOrderCount();

        int discount = discountPolicy.discount(member, itemPrice);
        int deliveryFee = member.getGrade() == Grade.VIP ? 0 : 3000;

        Order order = new Order(memberId, itemName, itemPrice - discount, deliveryFee);

        // 주문한 회원 정보와 음식 이름, 총 주문 금액 출력
        System.out.println("주문 회원 ID: " + memberId + ", 음식 이름: " + itemName + ", 총 주문 금액: " + order.calculatePrice());

        // 5번째 주문일 경우 VIP 승급 메시지 출력
        if (member.getOrderCount() == 5 && member.getGrade() == Grade.VIP) {
            System.out.println("5번째 주문 감사합니다! VIP로 승급되어 다음 주문부터 VIP 혜택이 적용됩니다.");
            System.out.println();
        }

        // 6번째 주문일 경우 VIP 할인 적용 메시지 출력
        if (member.getOrderCount() == 6 && member.getGrade() == Grade.VIP) {
            System.out.println("VIP 할인 및 무료 배달이 적용되었습니다.");
            System.out.println();
        }

        return order;
    }
}
