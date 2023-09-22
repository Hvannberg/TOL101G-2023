import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Dæmi byggt á Sedgewick and Wayne
 *  Lýsing  :  Forrit sem hermir eftir fjárhættuspilara í fjölda tilrauna
 *  Lesið er inn af staðalinntaki 3 heiltölur, stake, goal og trials
 *  sem segir hvað fjárhættuspilari vill leggja undir, hvað hann vill vinna og
 *  fjöldi hermana.
 *
 *  Notkun
 *  %java Gambler
 *  Hvað viltu leggja undir? 20
 *  Hvað viltu eiga í lokin? 100
 *  Hvað á að gera margar hermanir (tilraunir)? 1000
 * 208 vinningar í 1000 hermunum
 * Hlutfall unninna leikja = 20.8
 * Meðalfjöldi  veðmála         = 1511.856
 *****************************************************************************/

public class Gambler {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Hvað viltu leggja undir? ");
        int adVedi = inntak.nextInt();    // hvað leggur hann undir
        System.out.print("Hvað viltu eiga í lokin? ");
        int takmark = inntak.nextInt();    // hvert er takmarkið
        System.out.print("Hvað á að gera margar hermanir (tilraunir)? ");
        int hermanir = inntak.nextInt();   // fjöldi hermana

        int vedmal = 0;        // fjöldi veðmála alls
        int vinningar = 0;        // fjöldi veðmála alls sem fjárhættuspilari vann

        // endurtökum  hermanir
        for (int t = 0; t < hermanir; t++) {

            // ein hermun fjárhættuspilarans
            int peningur = adVedi;
            while (peningur > 0 && peningur < takmark) {
                vedmal++;
                if (Math.random() * 10 < 5) {
                    peningur++;     // vinnur eina kr
                }
                else {
                    peningur--;     // tapar 1 kr
                }
            }
            // Endar eina hermun
            if (peningur == takmark) {
                vinningar++;                // Náði fjárhættuspilarinn takmarki sínu?
            }
        }

        // print results
        System.out.println(vinningar + " vinningar í " + hermanir + " hermunum");
        System.out.println("Hlutfall unninna leikja = " + 100.0 * vinningar / hermanir);
        System.out.println("Meðalfjöldi  veðmála         = " + 1.0 * vedmal / hermanir);
    }
}
