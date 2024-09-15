package mini.mini_proj1.member;

public class MemberService {
    private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    public void join(Member member) {
        memberRepository.save(member);
        System.out.println("회원 가입 완료! 회원 아이디: " + member.getId() + ", 이름: " + member.getName() + ", 등급: " + member.getGrade());
    }

    public Member findMember(Long memberId) {
        Member member = memberRepository.findById(memberId);
        System.out.println("회원 조회 완료! 회원 아이디: " + member.getId() + ", 이름: " + member.getName() + ", 등급: " + member.getGrade());
        System.out.println();
        return member;
    }
}
