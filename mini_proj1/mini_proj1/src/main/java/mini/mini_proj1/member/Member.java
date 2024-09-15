package mini.mini_proj1.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;
    public int orderCount;

    public Member(Long id, String name, Grade grade, int orderCount) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.orderCount = orderCount;
    }

    public void increaseOrderCount() {
        this.orderCount++;
        if (this.orderCount >= 5) {
            this.grade = Grade.VIP;
        }
    }

    public Grade getGrade() {
        return grade;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}