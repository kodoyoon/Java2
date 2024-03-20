package access.ex;

public class ShoppingCart {
    private Item [] items = new Item[10]; //아이템을 담을 수 있는 배열
    private int itemCount; //배열에 저장된 아이템의 개수 , 초기값이 0

    public void addItem(Item item) {
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i< itemCount; i++) {
           Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i< itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
