package tdd.presentation;

public class TddPresentation {

    public static void main(String[] args) {
        Account myAccount = new Teller().openNewAccount();

        Receipt receipt = myAccount.deposit(new Money("56.66"));

        System.out.println(receipt.describe());
    }
}
