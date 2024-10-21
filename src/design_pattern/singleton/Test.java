package design_pattern.singleton;

public class Test {
    public static void main(String[] args) {
        DatabaseConnector.getInstance().connect();
        DatabaseConnector.getInstance().disconnect();

        DatabaseConnector o1 = DatabaseConnector.getInstance();
        DatabaseConnector o2 = DatabaseConnector.getInstance();
        System.out.println(o1 == o2);
    }
}
