package static2;

public class DecoData {

    private static int staticValue;
    private int instanceValue;

    public static void staticCall() {
//        instanceValue++; 인스턴스 변수 접근, compile error
//        instanceMethod(); 인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수에 접근
        staticMethod(); //정적 메서드 접근
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
}

//클래스 내부의 기능을 사용할 때, 정적 메서드는 static 이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
// 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.

// 반대로 모든 곳에서 static 을 호출 할 수 있다.
// 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static 을 호출 할 수 있다.
