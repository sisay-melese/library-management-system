public class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        if (memberId == null || name == null) {
            throw new IllegalArgumentException("Member ID and name cannot be null");
        }
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}
