package design_pattern.factory_method;

public abstract class Logistics {

    public void generateTransport() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
