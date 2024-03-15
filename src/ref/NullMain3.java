package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BIgData bigData = new BIgData();
        System.out.println("bigData.count = " + bigData.count); //생성하면 초기값 0
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); //null.value
    }
}
