package design_pattern.creation.abstract_factory;

public class FactoryProducer {

    public static AbstractFactory geFactory(String factory) {
        if (factory.equals("ELECTRIC")) {
            return new ElectricCarFactory();
        } else if (factory.equals("PETROL")) {
            return new PetrolCarFactory();
        }

        return null;
    }

}
