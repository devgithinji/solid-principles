package dip;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(long amount) {
        System.out.println("using debit card");
    }
}
