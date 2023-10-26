import java.awt.Color;
import java.util.Date;
/******************************************************************************
 *  Nafn    : Liang
 *  T-póstur: Introduction to Java Programming and Data Structures, Comprehensive Version
 *
 *  Lýsing  : Útfærir rúmfræðilegan hlut
 *
 *
 *****************************************************************************/

public abstract class GeometricObject { // Abstract merkir að við búum aldrei til hlut af þessum klasa
    private Color color;    // athugið að þetta er útfært öðruvísi í bókinni
    private boolean filled;
    private Date dateCreated;

    // smiðir

    /**
     * Sjálfgefinn smiður. Setur dagsetningu sem núverandi dagsetningu.
     */
    public GeometricObject() {
        dateCreated = new Date();
    }

    /**
     * Smíðar hlut af lit og hvort hann er fylltur,
     * setur dagsetningu sem núverandi dagsetningu.
     * @param color liturinn á hlutnum
     * @param filled á að teikna rúmfræðilega hlutsins fylltan
     */
    public GeometricObject(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date(); // núverandi dagsetning og tími
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString() {
        return "created on "+dateCreated+
                " color: " + color +
                " and filled: " + filled;
    }

    /**
     * Teiknar rúmfræðihlutinn - útfært í undirklösum
     */
    public abstract void draw ();

    public static void main(String[] args) {

    }
}
