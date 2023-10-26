import java.awt.Color;
import java.awt.Point;
/******************************************************************************
 *  Nafn    : Liang
 *  Introduction to Java Programming and Data Structures, Comprehensive Version
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Circle extends GeometricObject {
    private double radius;
    private Point center;
    // smiðir

    public Circle () {
    }

    /**
     * Smíðar hring með radíus
     * @param radius radíus
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Smíðar hring með lit, filled og radíus
     *
     * @param p miðja
     * @param radius radíus
     * @param color  litur
     * @param filled fylltur
     */
    public Circle(Point p, double radius, Color color, boolean filled) {
      // super(color, filled);
        setColor (color);
        setFilled(filled);
        this.radius = radius;
        this.center = p;
    }
    /**
     * Smíðar hring með lit, filled og radíus
     *
     * @param radius radíus
     * @param color  litur
     * @param filled fylltur
     */
    public Circle(double radius, Color color, boolean filled) {
        // super(color, filled);
        setColor (color);
        setFilled(filled);
        this.radius = radius;
        this.center = new Point(0,0);
    }

    // get- og set aðferðir
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // aðferðir fyrir ummál og flatarmál

    /**
     * Reiknar út ummál hrings og skilar því
     * @return ummál hrings
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Reiknar flatarmál hrings og skilar því
     * @return flatarmál hrings
     */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                                   " and the radius is " + radius);
    }

    public String toString () {
        return super.toString() + "\nradius is "+radius;
    }

    /**
     * Teiknar hringinn á canvas sem þegar er búið til
     * Forskilyrði: Búið er að búa til canvas
     */
    public void draw() {
        StdDraw.setPenColor(getColor());
        if (isFilled()) {
            StdDraw.filledCircle(center.x, center.y, radius);
        } else {
            StdDraw.circle (center.x, center.y, radius);
        }
    }

    /**
     * Prófunaraktygi.
     * @param args ónotað
     */
    public static void main(String[] args) {
        Circle testCircle = new Circle (new Point(200,200), 3, Color.RED, true);
        System.out.println (testCircle);
    }
}
