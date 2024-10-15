package SOLID.liskov_subsituation_principle;

public class Test {
    public static void main(String[] args) {
        Vehicle v = new PetroCar("Tesla", 2);

        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}
