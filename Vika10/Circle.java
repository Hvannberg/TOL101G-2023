import java.awt.Color;

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
     * @param color litur
     * @param filled fylltur
     * @param radius radíus
     */
    public Circle(Color color, boolean filled, double radius) {
      // super(color, filled);
        setColor (color);
        setFilled(filled);
        this.radius = radius;
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
     * Prófunaraktygi.
     * @param args ónotað
     */
    public static void main(String[] args) {
        Circle testCircle = new Circle (Color.RED, true, 3);
        System.out.println (testCircle);
    }
}
