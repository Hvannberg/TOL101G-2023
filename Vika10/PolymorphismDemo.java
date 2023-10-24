
import java.awt.Color;

/******************************************************************************
 *  Nafn    : Liang.
 *
 *
 *  Lýsing  : Sýnidæmi um polymorphism
 *
 *
 *****************************************************************************/

public class PolymorphismDemo {
    /**
     * Main method.
     *
     * @param args ónótað
     */
    public static void main(final String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1, Color.RED, false));
        displayObject(new Rectangle(1, 1, Color.BLACK, true));
    }

    /**
     * Display geometric object properties.
     *
     * @param object sem á að birta
     */
    public static void displayObject(final GeometricObject object) {
        System.out.println("Prentað með GeometricObject aðferðum");
        System.out.println("Created on " + object.getDateCreated()
                                   + ". Color is " + object.getColor());
        System.out.println("Hér sjáum við hver hluturinn er");
        System.out.println(object);
    }
}
