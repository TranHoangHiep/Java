package SOLID.liskov_subsituation_principle;

public class ElectricCar extends Vehicle {
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("ElectricCar speedUp");
    }

    @Override
    protected void slowDown() {
        System.out.println("ElectricCar slowDown");
    }

    @Override
    protected void fuel() {
        System.out.println("ElectricCar are charging");
    }
}
