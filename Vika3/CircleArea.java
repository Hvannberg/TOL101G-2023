import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Reiknar út flatarmál hrings sem hefur radíus sem er lesinn inn
 *  af console. Skrifar út "Illegal area" ef radíus er neikvæð annars
 *  er flatarmálið skrifað út
 *
 *****************************************************************************/

public class CircleArea {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        double rad = inntak.nextDouble();
        if (rad < 0.0) {
            System.out.println("Illegal area");
        }
        else {
            double area = Math.PI * rad * rad;
            System.out.println("Area is " + area);
        }
    }
}
