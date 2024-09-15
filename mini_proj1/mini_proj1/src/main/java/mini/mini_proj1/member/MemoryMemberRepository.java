package mini.mini_proj1.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository {
    private static Map<Long, Member> store = new HashMap<>();

    public void save(Member member) {
        store.put(member.getId(), member);
    }

    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
