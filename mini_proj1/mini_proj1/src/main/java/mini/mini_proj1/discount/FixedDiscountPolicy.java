package mini.mini_proj1.discount;

import mini.mini_proj1.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {
    private final int discountAmount = 0;

    @Override
    public int discount(Member member, int price) {
        return discountAmount;
    }
}