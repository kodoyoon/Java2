package helloshop.order;

import helloshop.product.Product;
import helloshop.user.User;

public class OrderService {
    public void Order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
