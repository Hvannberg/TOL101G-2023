import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Sýnir notkun hornafalla úr Math klasanum. Tekur inn af skipanalínu
 *  gráður sem kommutölu og reiknar út sin og cos og tan og prentar út.
 *
 *****************************************************************************/

public class Trig {
    public static void main(String[] args) {

        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);

        final double DEGREES = inntak.nextDouble();
        double radians = Math.toRadians(DEGREES);

        double s = Math.sin(radians);
        System.out.println("sin(" + DEGREES + ") = " + s);

        double c = Math.cos(radians);
        System.out.println("cos(" + DEGREES + ") = " + c);

        double t = Math.tan(radians);
        System.out.println("tan(" + DEGREES + ") = " + t);
        System.out.println(s + " / " + c + " = " + s / c);

        double r = s * s + c * c;
        System.out.println(s * s + " + " + c * c + " = " + r);
    }
}
