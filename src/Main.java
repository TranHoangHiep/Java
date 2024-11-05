import design_pattern.creation.factory_method.Logistics;
import design_pattern.creation.factory_method.RoadLogistics;
import design_pattern.creation.factory_method.SeaLogistics;

public class Main {

    public static Logistics logistics;
    public static void main(String[] args) {
        System.out.println("=====> Factory method");
        String env = "sea";
        System.out.println("env: " + env);
        if(env.equals("road")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }
        logistics.generateTransport();
    }
}