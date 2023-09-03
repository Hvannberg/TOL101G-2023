import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn radíus hrings af console, reiknar flatarmál hrings og prentar út
 *            ef radíus er jákvæð tala annars prentar forritið út Neikvæð tala
 *            Kafli 3.4
 *  Notkun:
 *  %java FlatarmalHrings
 *  20  <-- inntak
 *  Flatarmál hrings fyrir radíus 20.0 er 1256.636 <-- uttak:::
 *
 *****************************************************************************/

public class FlatarmalHringsLogleg {
    public static void main(String[] args) {
        final double PI_TALA = 3.14159; // fasti fyrir PI
        // Skilgreiningar á breytum
        double radius;  // Skilgreinum radíus hrings
        double flatarmal;  // Skilgreinum flatarmál
        // Lesa inn radíus hrings af console
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        radius = inntak.nextDouble();
        if (radius >= 0) {
            // Reikna flatarmál hrings
            flatarmal = radius * radius * PI_TALA;
            // Prenta út flatarmál
            System.out.println("Flatarmál hrings fyrir radíus " + radius + " er " + flatarmal);
        } else
            System.out.println ("Neikvæð tala");
    }
}
