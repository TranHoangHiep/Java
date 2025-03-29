package design_pattern.SOLID.open_close_principle;

public class Test {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.process(new GolangInterviewQuestion());
    }

}
