import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Spilastokkur með 52 spilum
 *
 *
 *****************************************************************************/
public class Stokkur {
    /**
     * Random generator - klasabreyta
     */

    private static final Random random = new Random();
    /**
     * Spilin
     */
    private final ArrayList<Spil> spilin = new ArrayList<>();

    /**
     * Smiður sem býr til spilin 52
     */
    public Stokkur() {
        for (Spil.Sort s : Spil.Sort.values()) {
            for (Spil.Gildi g : Spil.Gildi.values()) {
                spilin.add(new Spil(s, g));
            }
        }
    }

    /**
     * Stokkar spilin af handahófi
     */
    public void stokka() {
        for (int i = 0; i < spilin.size(); i++) {
            int k = random.nextInt(spilin.size() - i) + i;
            Spil t = spilin.get(i);
            spilin.set(i, spilin.get(k));
            spilin.set(k, t);
        }
    }

    /**
     * raðar spilunum skv. compareTo aðferð á Spil
     */
    public void sort() {
        Collections.sort(spilin);
    }

    /**
     * main fall til að próf stokkinn og spilin
     * @param args ónotað
     */
    public static void main(String[] args) {
        Stokkur s = new Stokkur();
        System.out.println(Arrays.toString(s.spilin.toArray()));
        s.stokka();
        System.out.println(Arrays.toString(s.spilin.toArray()));
        s.sort();
        System.out.println(Arrays.toString(s.spilin.toArray()));
    }
}
