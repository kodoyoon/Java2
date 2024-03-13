package ref;

public class VarChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10; //객체를 생성하면 참조값이 생성이 되고, 이 참조값을 통해 객체에 접근해서 객체를 사용한다.
        Data dataB = dataA; //인스턴스가 복사돼서 만들어지는 것이 아니라 , 참조값만 읽어서 B 에 들어가는것.

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
