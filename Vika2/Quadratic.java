import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Leysir annars stigs jöfnuna x^2 +bx + c = 0 þar sem b og c eru
 *            viðföng sem lesin eru inn af console
 *
 *  Dæmi um notkun
 *  %java Quadratic
 *  -10 -8             <-- inntak
 *  10.744562646538029 <-- úttak
 * -0.7445626465380286
 *****************************************************************************/

public class Quadratic {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);

        // parse coefficients from command-line
        double b = inntak.nextDouble();
        double c = inntak.nextDouble();
        // calculate roots
        double discriminant = b * b - 4.0 * c;
        // double sqrt (double )  þetta er skilgreiningin:q!
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) / 2.0;
        // print them out
        System.out.println(root1);
        System.out.println(root2);
    }
}

