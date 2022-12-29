package src.W2_OOPS_IShapes.beans;

public class Square extends Rectangle {
    private double side;
    static String type = "Square";
    //constructor
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
