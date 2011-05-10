package tdd.presentation;

public class Teller {

    public Account openNewAccount() {
        return new Account(new AccountReference(111111, 12345678), Money.ZERO);
    }
}
