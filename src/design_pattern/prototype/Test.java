package design_pattern.prototype;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Square(10, 5);
        shape.draw();

        Shape squareClone = shape.cloneObject();
        squareClone.draw();
    }
}
