package design_pattern.behavior.strategy;

public class Multiplication implements Strategy {
    @Override
    public void execute(int numb1, int numb2) {
        System.out.println(numb1 + " * " + numb2 + " = " + (numb1 * numb2));
    }
}
