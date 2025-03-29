package design_pattern.behavior.strategy.shopping_card;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        this.strategy.pay(amount);
    }
}
