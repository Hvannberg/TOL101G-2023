/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasinn lýsir spili sem hægt er að stokka og raða
 *
 *
 *****************************************************************************/

public class Spil implements Comparable<Spil>{
    /**
     * tag fyrir sortina á spilinu
     */
    public enum Sort {
        Hjarta, Spadi, Tigull, Lauf
    }

    /**
     * tag fyrir gildið
     */
    public enum Gildi {
        as, tvistur, thristur, fjarki, fimma, sexa, sjöa, atta, nia, tia, gosi, drottning, kongur
    }

    /**
     * sortin
     */
    private Sort sort;
    /**
     * gildið
     */
    private Gildi gildi;

    /**
     * smiður sem tekur inn sort og gildi
     * @param s sortin
     * @param g gildið
     */
    public Spil(Sort s, Gildi g) {
        sort = s;
        gildi = g;
    }

    /**
     * Ber saman tvö spil
     * @param o the object to be compared.
     * @return 0 ef spilin eru eins, -1 ef þetta spil er minna en o annars 1
     */
    public int compareTo(Spil o) {
        return o.sort.ordinal() != this.sort.ordinal() ?
               Integer.compare(this.sort.ordinal(), o.sort.ordinal()) :
               Integer.compare(this.gildi.ordinal(), o.gildi.ordinal());
    }

    /**
     * Skilar streng sem lýsir spilinu
     * @return lýsing spilsins
     */
    public String toString () {
        return sort.name() + " " + gildi.name();
    }

    public static void main(String[] args) {

    }
}
