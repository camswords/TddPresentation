package tdd.presentation;

import java.util.Date;

public class Receipt {

    private final Money amount;
    private final AccountReference accountReference;
    private final Money balance;
    private final Date date;

    public Receipt(Money amount, AccountReference accountReference, Money balance, Date date) {
        this.amount = amount;
        this.accountReference = accountReference;
        this.balance = balance;
        this.date = date;
    }

    public String describe() {
        String message = "---------------------------\n" +
                         "Receipt\n" +
                         "Date: %s\n" +
                         "Account: %s\n" +
                         "%s was deposited leaving a balance of %s\n" +
                         "---------------------------";
        return String.format(message, 
                             date, accountReference.describe(),
                             amount.describe(), balance.describe());
    }
}
