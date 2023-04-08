package org.patterns.strategy.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paypal implements Payment {
    private String email;
    @Override
    public void pay(int amount) {
        System.out.println(String.format("%d paid with Paypal.", amount));
    }
}
