package oop1;

public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
//클래스는 데이터인 멤버 변수 뿐 아니라 기능 역할을 하는 메서드도 포함할 수 있다.