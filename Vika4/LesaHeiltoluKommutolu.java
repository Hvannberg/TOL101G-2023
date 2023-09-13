/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Notandi er spurður hvort hann vilji lesa inn heiltölu.
 *  Forritið les inn heiltölu eða kommutölu eftir óskum notanda.  *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LesaHeiltoluKommutolu {
    public static void main(String[] args) {
        // lesa inn gögnin
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Viltu lesa inn heiltölu [já/nei]? ");
        int heiltala;
        double kommutala;
        String svar = inntak.next();
        String tala = inntak.next();

        // breyta í heiltölu eða kommutölu eftir því hvert svarið er og prenta út
        if (svar.equalsIgnoreCase ("já")) { // skiptir ekki máli hvort það eru stórir eða litlir stafir
            heiltala = Integer.parseInt(tala);
            System.out.println(heiltala);
        } else {
            kommutala = Double.parseDouble(tala);
            System.out.println(kommutala);
        }
    }
}
