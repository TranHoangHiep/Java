package design_pattern.behavior.command;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

}
