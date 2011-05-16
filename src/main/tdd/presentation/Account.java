package tdd.presentation;

public class Account {
    
    private final AccountReference accountReference;
    private Money balance;

    public Account(AccountReference accountReference, Money startingBalance) {
        this.accountReference = accountReference;
        this.balance = startingBalance;
    }

    public void deposit(Money amount) {
        balance = balance.add(amount);
    }
}
