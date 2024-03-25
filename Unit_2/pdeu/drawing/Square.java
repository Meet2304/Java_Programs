package pdeu.drawing;

public class Square extends Shape implements Resizable {
    private double Side;
    public Square(String c, String p, double s) {
        super(c, p);
        this.Side = s;
    }

    public double calculateArea() {
        return Side * Side;
    }

    public double calculatePerimeter() {
        return 4 * Side;
    }

    public void resize(int factor) {
        Side *= factor;
    }
}
