import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Reiknar út kvaðratrót af tölu sem fenginn er úr viðfangsbreytu ef
 *  talan er jákvæð. Annars gerir forritið ekkert.
 *
 *
 *****************************************************************************/

public class TestSqrt {
    public static void main(String[] args) {
            Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
            double num = inntak.nextDouble();
            if (num >= 0.0) {
                System.out.println("Sqrt is " + Math.sqrt(num));
            }
    }
}


