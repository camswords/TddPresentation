package tdd.presentation;

public class JohnsonsSystem {

    public static void main(String[] args) {
        Account myAccount = new Teller().openNewAccount();

        DepositReceipt receipt = myAccount.deposit(new Money("56.66"));
    }
}
