package tdd.presentation;

import java.math.BigDecimal;

public class Money {

    public static final Money ZERO = new Money("0.00");

    private final BigDecimal value;

    public Money(String value) {
        this.value = new BigDecimal(value);
    }

    public Money(BigDecimal value) {
        this.value = value;
    }

    public Money add(Money amount) {
        return new Money(value.add(amount.value));
    }

    public String describe() {
        return "£" + value.toString();
    }
}
