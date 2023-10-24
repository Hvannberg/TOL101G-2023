import java.awt.Color;

/******************************************************************************
 *  Nafn    : Liang
 *  Introduction to Java Programming and Data Structures, Comprehensive Version
 *
 *  Lýsing  : Útfærir rétthyrning
 *
 *
 *****************************************************************************/

public class Rectangle extends GeometricObject{

    private double width;   // breidd
    private double height;  // hæð

    /**
     * Smíðar rétthyrning
     * @param width breidd
     * @param height hæð
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Smíðar rétthyrning með lit, filled, breidd og hæð
     * @param color liturinn
     * @param filled á að teikna rétthyrninginn fylltan
     * @param width breidd
     * @param height hæð
     */
    public Rectangle(Color color, boolean filled, double width, double height) {
        // má einnig nota super(color, filled);
        // super (color, filled);
        this.width = width;
        this.height = height;
        setColor (color);
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
     * @return flatarmálið
     */
    public double getArea () {
        return width*height;
    }

    /**
     * Reiknar og skilar ummálinu.
     * @return ummálið
     */
    public double getPerimeter () {
        return 2*(width + height);
    }

    /**
     * Prófunaraktygi.
     * @param args ónotað
     */
    public static void main(String[] args) {
        Rectangle testRectangle = new Rectangle (3, 4);
        System.out.println (testRectangle);
    }
}
