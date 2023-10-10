import java.util.Objects;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasi sem inniheldur upplýsingar um nemanda
 *
 *
 *****************************************************************************/

public class Nemandi {
    private String nafn;    // nafn nemanda
    private String tPostur; // tölvupóstur nemanda

    /**
     * Smiður sem tekur inn nafn og tölvupóst nemanda
     *
     * @param n nafn
     * @param t tölvupóstfang
     */
    public Nemandi(String n, String t) {
        nafn = n;
        tPostur = t;
    }

    // gettera og settera þarf ekki að skjala
    public String gettPostur() {
        return tPostur;
    }

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }


    public String toString() {
        return "Nemandi{" +
                "nafn='" + nafn + '\'' +
                ", tPostur='" + tPostur + '\'' +
                '}';
    }

    /**
     * Skilar true ef nafn er sama og fyrra stak í gogn og tölvupóstur er sama og seinna stak í gogn
     *
     * @param gogn gögn nemandans, nafn og tölvupóstur
     * @return satt ef gogn innihalda sama nafn og tölvupóst og eiginleikar hlutarins
     */
    public boolean equalsString(String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        return this.equals(n);
    }


    /**
     * Ber saman eiginleika o við eiginleika hlutarins
     * Athugið þessi aðferð var framleidd (generate)
     *
     * @param o hlutur sem á að bera saman við
     * @return true ef hluturinn o er eins og hluturinn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nemandi nemandi = (Nemandi) o;
        return Objects.equals(nafn, nemandi.nafn) && Objects
                .equals(tPostur, nemandi.tPostur);
    }

    public int hashCode() {
        return Objects.hash(nafn, tPostur);
    }

    // lítið prófunaraktygi
    public static void main(String[] args) {
        Nemandi n = new Nemandi("Bjarney", "b2@hi.is");
        System.out.println(n);
        System.out.println(n.getNafn());

    }
}
