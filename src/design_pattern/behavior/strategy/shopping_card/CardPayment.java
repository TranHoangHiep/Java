package design_pattern.behavior.strategy.shopping_card;

public class CardPayment implements Strategy {

    @Override
    public void pay(int amount) {
        System.out.println("CardPayment: " + amount);
    }

}
