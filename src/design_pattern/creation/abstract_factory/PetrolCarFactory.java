package design_pattern.creation.abstract_factory;

public class PetrolCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if (type.equals("TOYOTA")) {
            return new PetrolToyota();
        } else if (type.equals("FORD")) {
            return new PetrolFord();        
        }

        return null;
    }

}
