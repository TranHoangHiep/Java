package SOLID.dependency_inversion_principle;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from a MySQL database...");
    }
}
