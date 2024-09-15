package mini.mini_proj1.discount;

import mini.mini_proj1.member.Grade;
import mini.mini_proj1.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private final int discountPercent = 5;

    @Override
    public int discount(Member member, int price) {
        if (member.orderCount == 6) {
            return price * discountPercent / 100;
        } else {
            return -3000;
        }
    }
}
