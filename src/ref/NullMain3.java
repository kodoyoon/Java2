package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BIgData bIgData = new BIgData();
        System.out.println("bigData.count = " + bIgData.count); //생성하면 초기값 0
        System.out.println("bigData.data = " + bIgData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bIgData.data.value); //null.value
    }
}
