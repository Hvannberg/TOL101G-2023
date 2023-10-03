import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing: Sýnir notkun fallsins finna sem finnur heiltölu í
 *  fylki. Fylkið er smíðað eftir höfði notandans og fyllt með slembitölum
 *
 *****************************************************************************/

public class Finna {

    /**
     * Finnur stak x í fylkinu a og skilar indexnum
     *
     * @param a heiltölufylki
     * @param x stakið sem á að finna
     * @return skilar vísinum en -1 ef stakið finnst ekki
     */
    public static int finna(int[] a, int x) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == x) return i;
        return -1;
    }


    public static void main(String[] args) {
        // búum til random generator
        Random r = new Random();
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        // lesum inn stærð fylkisins
        int n = lesaTolu("Hvað á fylkið að vera stórt? ", inntak);
        // smíðum fylkið af stærð n og setjum slembigildi úr random generator r
        int[] a = getFylki(r, n);
        // prentum út fylkið
        System.out.println(Arrays.toString(a));

        int stak = lesaTolu("Hvaða stak viltu finna? ", inntak);

        // finnum stakið
        int index = finna(a, stak);
        // prentum niðurstöðuna
        System.out.println(index == -1 ? "stakið " + stak + " fannst ekki" :
                           "stakið " + stak + " fannst í sæti  " + index);
    }

    /**
     * Býr til fylki af stærð n og setur slembitölur í það úr random generator r
     * @param r random generator
     * @param n stærð fylkis
     * @return skilar fylki
     */
    private static int[] getFylki(Random r, int n) {
        int[] a = new int[n];
        // frumstillum fylkið með slembitölum
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n);
        }
        return a;
    }


    /**
     * Promptar notanda með s - les tölu frá inntak og skilar tölunni
     * @param s prompt til notanda
     * @param inntak inntaksleiðin
     * @return tala sem hefur verið lesin inn
     */
    private static int lesaTolu(String s, Scanner inntak) {
        System.out.print(s);
        int n = inntak.nextInt();
        return n;
    }
}
