package construct;

public class MemberInit { //4, 5, 6 은 멤버변수
    String name; //얘네 값을 넣어주고 싶은거임
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;  //자기 자신의 인스턴스를 가르킴, this 가 없으면 name = name 이름이 똑같음
        this.age = age;
        this.grade = grade;
    }
} // 가까운 scope 이 우선순위를 가짐
