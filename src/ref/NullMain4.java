package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BIgData bigData = new BIgData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
