import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Sýnir aðgerðir á heiltölur. Tvær tölur lesnar inn af console
 *  og gerðar heiltöluaðgerðir á þeim og prentað út
 *
 *  Notkun:
 *  %java IntOps
 *  200 3         <-- Inntak
 *  200 + 3 = 203 <-- úttak
 *  200 * 3 = 600
 *  200 / 3 = 66
 *  200 % 3 = 2
 *****************************************************************************/

public class IntOps {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);

        int a = inntak.nextInt();
        int b = inntak.nextInt();
        int sum = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
    }
}
