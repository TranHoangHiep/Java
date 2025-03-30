package design_pattern.creation.abstract_factory;

public class App {
    public static void main(String[] args) {
         AbstractFactory abstractFactory = FactoryProducer.geFactory("PETROL");

         Car car = abstractFactory.getCar("TOYOTA");
         car.assembe();
    }
}
