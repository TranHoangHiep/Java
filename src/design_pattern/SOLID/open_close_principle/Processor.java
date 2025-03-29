package design_pattern.SOLID.open_close_principle;

public class Processor {
    public void process(InterviewQuestion question) {
        question.execute();
    }

}
