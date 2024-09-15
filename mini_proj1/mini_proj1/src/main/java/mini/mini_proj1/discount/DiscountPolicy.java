package mini.mini_proj1.discount;

import mini.mini_proj1.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}