package Projects.LibraryManagementSystem;

public class Member {
    private static int Counter = 100;
    private String name;
    private String memberId;
    private String password;

    public Member(String name, String password) {
        this.memberId = "Member_" + Counter++;
        this.name = name;
        this.password = password;
    }

    public static int getCounter() {
        return Counter;
    }

    public static void setCounter(int counter) {
        Counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
