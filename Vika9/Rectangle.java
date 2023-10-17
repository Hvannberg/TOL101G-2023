import java.awt.Point;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : úr Sedgewick and Wayne en með dæmi um aðra útfærslu.
 *
 *
 *****************************************************************************/

public class Rectangle {
    /* Dæmi um aðra útfærslu
    private final int x, y; // center of rectange
    private final int width; // width of rectangle
    private final int height; // height of rectangle*/

    private final Point p0; // vinstra neðra horn
    private final Point p1; // hægra efra horn

    /**
     * @param x0 miðja - x
     * @param y0 miðja - y
     * @param w  breidd
     * @param h  hæð
     */
    public Rectangle(int x0, int y0, int w, int h) {
        // Búa til p0 hlut og setja vinstra neðra horn
        // búa til p1 og setja í hægra efra horn
        p0 = new Point(x0 - w / 2, y0 - h / 2);
        p1 = new Point(x0 + w / 2, y0 + h / 2);

    }

    /**
     * Smíðar rétthyrning með neðra vinstra hroni p0 og efra vinstra horni p1
     * @param p0
     * @param p1
     */
    public Rectangle(Point p0, Point p1) {
        this.p0 = new Point(p0);
        this.p1 = new Point (p1);
    }

    public double area() {
        double w = getLength(p1.getX(), p0.getX());
        double h = getLength(p1.getY(), p0.getY());
        return w * h;
    }



    public double perimeter() {
        return 2 * getLength(p1.getX(), p0.getX()) + 2 * getLength(p1.getY(), p0.getY()) ;
    }

    // ekki útfært enn þá
    public boolean intersects(Rectangle b) {
        return false;

    }

    public String toString() {
        return "miðja rétthyrnings í (" + (p0.getX() + getWidth(p1,p0) / 2) + "," + (p0.getY()
                + getHeight(p1, p0)/ 2) + ") og breidd er " +getWidth(p1,p0)
                + " og hæð er "
                +getHeight(p1, p0);
    }

    // private methods
    private double getLength(double p1, double p0) {
        return p1 - p0;
    }

    private  double getWidth(Point p1, Point p0) {
        return getLength(p1.x, p0.x);
    }
    private double  getHeight(Point p1, Point p0) {
        return getLength(p1.x, p0.x);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(50, 50, 50, 100);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(new Point(25, 50 ), new Point(75, 100));
        System.out.println(r2);
    }
}
