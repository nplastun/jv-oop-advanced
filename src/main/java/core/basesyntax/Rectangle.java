package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArray() {
        return height * width;
    }

    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArray() + " sq. units, width: "
                + width + " units, height:"
                + height + " units, color: " + getColor());
    }
}