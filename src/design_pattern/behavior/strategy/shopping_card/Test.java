package design_pattern.behavior.strategy.shopping_card;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new PaypalPayment());
        context.pay(10);
    }
}
