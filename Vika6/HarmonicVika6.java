/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Harmonic klasinn úr viku 5 var endurskrifaður með aðferðinni harmonic
 *            Vika 6
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HarmonicVika6 {
    public static void main(String[] args) {
        // lesa inn n
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();

        double minSumma = harmonic (n);
        // prenta út summuna
        System.out.println(minSumma);
    }

    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        return sum;
    }
}
