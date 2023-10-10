/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Circle {

    // tilviksbreytur
    private double radius = 1;  // sjálfgefið gildi tilviksbreytu


    // smiður með sjálfgefnum radíus
    public Circle () {

    }
    /**
     * Smíðar hlut af klasanum og skilar honum
     * @param newRadius radíus hringsins
     */
    public Circle(double newRadius) {
        radius = newRadius;     // radíus hlutarins verður gildið úr parameter
    }

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

    // get og set aðferðir - þarf ekki að skjala - Búið til með Alt-Insert
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // sýnir gildi hlutarins
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    // prófanaaktygi fyrir klasann
    // Í bókinni eru búinn til sérstakur klasi til að prófa Circle klasann TestCircle -
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println (c1);
        System.out.println ("Flatarmál hrings með radíus "+c1.getRadius() + " er "+c1.getArea());
        System.out.println ("Ummál hrings með radíus "+c1.getRadius() + " er "+c1.getPerimeter());

        Circle c2 = new Circle(25);
        System.out.println (c2);
        System.out.println ("Flatarmál hrings með radíus "+c2.getRadius() + " er "+c2.getArea());
        System.out.println ("Ummál hrings með radíus "+c2.getRadius() + " er "+c2.getPerimeter());
    }
}
