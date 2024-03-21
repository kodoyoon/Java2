package static2;

public class DecoUtil2 {
    public static String deco(String str) { //정적 메서드, 정적 메서드는 인스턴스 생성 없이 클래스 명을 통해서 바로 호출 가능
        String result = "*" + str + "*";
        return result;
    }
//인스턴스 메서드 -> 인스턴스를 생성해야 호출 가능

}
