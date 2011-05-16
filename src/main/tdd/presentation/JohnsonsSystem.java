package tdd.presentation;

public class JohnsonsSystem {

    public static void main(String[] args) {
        Account myAccount = new Teller().openNewAccount();

        myAccount.deposit(new Money("56.66"));
    }
}
