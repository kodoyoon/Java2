package static1;

public class Data3 {
    public static int count; //static -> 공용으로 함께 사용하는 변수를 만들 수 있다. -> static 변수 = 정적 변수 = 클래스 변수
    public String name;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
