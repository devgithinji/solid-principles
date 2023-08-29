package dip;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(long amount) {
        System.out.println("using credit card");
    }
}
