/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Hér er kallað á harmonic fallið úr öðrum klasa
 *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class DaemiVika6 {
    public static void main(String[] args) {
        // lesa inn n
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();
      //  nafnAKlasa.nafnAAdferd (parametrar)
        System.out.println (HarmonicVika6.harmonic (n));
    }
}
