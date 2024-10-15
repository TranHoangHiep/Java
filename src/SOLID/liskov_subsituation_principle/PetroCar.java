package SOLID.liskov_subsituation_principle;

public class PetroCar extends Vehicle {
    public PetroCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Petro Car speeds up");
    }

    @Override
    protected void slowDown() {
        System.out.println("Petro Car speeds down");
    }

    @Override
    protected void fuel() {
        System.out.println("Petro Car fuel");
    }
}
