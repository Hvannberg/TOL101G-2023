import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/******************************************************************************
 *  Nafn    :
 *  T-póstur:
 *
 *  Lýsing: Sýnir tvær mismunandi útgáfur af fallinu finna sem finnur heiltölu í
 *  fylki.
 *
 *
 *****************************************************************************/

public class Finna {

    public static int finna(int[] a, int x) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == x) return i;
        return -1;
    }


    public static void main(String[] args) {
        Random r = new Random();
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n);
        }
        System.out.println (Arrays.toString(a));
        System.out.println("finna 5:  " + finna(a, 5));
    }
}
