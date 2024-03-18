package construct;

public class MemberThis {
    String nameField; //멤버변수

    void initMember(String nameParameter) { //매개변수
        nameField = nameParameter; // 6번째에 있는 매개변수에 nameField가 없기 때문에 4번째(자기자신)줄로 감 ->this 생략

    }
}
