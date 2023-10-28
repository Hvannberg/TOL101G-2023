import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Reiknar út kvaðratrót af tölu sem fenginn er af staðalinntaki ef
 *  talan er jákvæð. Annars gerir forritið ekkert.
 *
 *****************************************************************************/

public class TestSqrtHandling {
    /**
     * Les inn kommutölu af staðalinntaki og reiknar kvaðratrót ef hún er jákvæð
     * Bregst við ef notandi slær inn tölu á röngu snið.
     *
     * @param args ónotað
     */
    public static void main(final String[] args) {
        try {
            Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
            double num = inntak.nextDouble();
            if (num >= 0.0) {
                System.out.println("Sqrt is " + Math.sqrt(num));
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Inntak verður að vera kommutala "
                                       + e.getMessage());
        }
    }
}

