package SOLID.dependency_inversion_principle;

public class Test {
    public static void main(String[] args) {

        DatabaseController controller = new DatabaseController(new OracleDatabase());

        controller.connect();
        controller.disconnect();
    }
}
