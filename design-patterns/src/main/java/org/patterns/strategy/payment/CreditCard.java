package org.patterns.strategy.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard implements Payment {
    private String name;
    private String cardNumber;

    @Override
    public void pay(int amount) {
        System.out.println(String.format("%d paid with credit card.", amount));
    }
}
