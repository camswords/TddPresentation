package tdd.presentation;

public class AccountReference {
    
    private final int sortCode;
    private final int number;

    public AccountReference(int sortCode, int number) {
        this.sortCode = sortCode;
        this.number = number;
    }

    public String describe() {
        return sortCode + "-" + number;
    }
}
