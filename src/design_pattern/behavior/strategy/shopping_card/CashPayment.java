package design_pattern.behavior.strategy.shopping_card;

public class CashPayment implements Strategy {

    @Override
    public void pay(int amount) {
        System.out.println("CashPayment: " + amount);
    }
}
