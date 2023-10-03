import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing: Sýnir notkun fallsins finna sem finnur heiltölu í
 *  fylki.
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
        System.out.print("Hvað á fylkið að vera stórt? ");
        int n = inntak.nextInt();
        // smíðum fylkið af stærð n
        int[] a = new int[n];
        // frumstillum fylkið með slembitölum
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n);
        }
        // prentum út fylkið
        System.out.println(Arrays.toString(a));
        System.out.print("Hvaða stak viltu finna? ");
        int stak = inntak.nextInt();
        // finnum stakið
        int index = finna(a, stak);
        // prentum niðurstöðuna
        System.out.println(index == -1 ? "stakið " + stak + " fannst ekki" :
                           "stakið " + stak + " fannst í sæti  " + finna(a, stak));
    }
}
