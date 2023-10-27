import java.awt.Color;
import java.awt.Point;
/******************************************************************************
 *  Nafn    : Liang
 *  Introduction to Java Programming and Data Structures, Comprehensive Version
 *
 *  Lýsing  : Útfærir rétthyrning
 *
 *
 *****************************************************************************/

public class Rectangle extends GeometricObject {

    private double width;   // breidd
    private double height;  // hæð
    private Point center;   // miðja

    /**
     * Smíðar rétthyrning
     *
     * @param width  breidd
     * @param height hæð
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Smíðar rétthyrning með lit, filled, breidd og hæð
     *
     * @param p miðjan
     * @param width  breidd
     * @param height hæð
     * @param color  liturinn
     * @param filled á að teikna rétthyrninginn fylltan
     */
    public Rectangle(Point p, double width, double height, Color color, boolean filled) {
        // köllum á smiðinn í þessum klasa með 4 parametrum
        this(width, height, color, filled);
        // að auki setjum við miðjuna
        this.center = p;
    }

    /**
     * Smíðar rétthyrning með lit, filled, breidd og hæð
     *
     * @param width  breidd
     * @param height hæð
     * @param color  liturinn
     * @param filled á að teikna rétthyrninginn fylltan
     */
    public Rectangle(double width, double height, Color color, boolean filled) {
        // má einnig nota super(color, filled);
        // super (color, filled);
        this.width = width;
        this.height = height;
        this.center = new Point(0,0);
        setColor(color);
        setFilled(filled);
    }


    // get og set aðferðir
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Reiknar og skilar flatarmálinu.
     *
     * @return flatarmálið
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Reiknar og skilar ummálinu.
     *
     * @return ummálið
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return super.toString() + "\nwidth is " + width + " and height is " + height;
    }

    /**
     * Teiknar rétthyrninginn á canvas sem þegar er búið til
     * Forskilyrði: Búið er að búa til canvas
     */
    public void draw() {
        StdDraw.setPenColor (getColor());
        if (isFilled()) {
            StdDraw.filledRectangle (center.x, center.y, width/2, height/2);
        } else {
            StdDraw.rectangle (center.x, center.y, width/2, height/2);
        }
    }

    /**
     * Prófunaraktygi.
     *
     * @param args ónotað
     */
    public static void main(String[] args) {
        Rectangle testRectangle = new Rectangle(3, 4);
        System.out.println(testRectangle);
    }
}
