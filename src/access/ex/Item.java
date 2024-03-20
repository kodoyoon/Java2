package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() { //상품명
        return name;
    }
    public int getTotalPrice() { //합계
        return price * quantity;
    }
}
