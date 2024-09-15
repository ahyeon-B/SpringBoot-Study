package mini.mini_proj1;

import mini.mini_proj1.member.Grade;
import mini.mini_proj1.member.Member;
import mini.mini_proj1.member.MemberService;
import mini.mini_proj1.order.Order;
import mini.mini_proj1.order.OrderService;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class OrderApp {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        MemberService memberService = new MemberService();

        // BASIC 회원 등록
        Member member = new Member(1L, "김은혜은혜", Grade.BASIC, 4);
        memberService.join(member);

        // 5번째 주문
        Order order = orderService.createOrder(1L, "꺼병이 떡볶이", 15000);

        // VIP 승급 후 6번째 주문
        Order vipOrder = orderService.createOrder(1L, "포자우 쌀국수", 20000);
    }
}
