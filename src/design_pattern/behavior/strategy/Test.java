package design_pattern.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        OperationManager manager = new OperationManager();
        manager.setStrategy(new Multiplication());
        manager.execute(10, 5);
    }
}
