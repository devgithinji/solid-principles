package dip;

public class ShoppingMall {

    public BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);

        BankCard bankCardTwo = new CreditCard();
        ShoppingMall shoppingMallTwo = new ShoppingMall(bankCardTwo);
        shoppingMallTwo.doPurchaseSomething(4000);
    }
}
