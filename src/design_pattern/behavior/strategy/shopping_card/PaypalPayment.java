package design_pattern.behavior.strategy.shopping_card;

public class PaypalPayment implements Strategy{

    @Override
    public void pay(int amount) {
        System.out.println("PaypalPayment: " + amount);
    }

}
