package org.patterns.strategy.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public int calculateTotal() {
        return productList
                .stream()
                .reduce(0, (subtotal, product) -> subtotal + product.getPrice(), Integer::sum);

    }

    public void pay(Payment paymentMethod) {
        int amount = this.calculateTotal();
        paymentMethod.pay(amount);
    }
}
