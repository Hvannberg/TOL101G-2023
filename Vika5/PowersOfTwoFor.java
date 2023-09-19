import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :  Reiknar út veldi af tveimur
 *
 *
 *****************************************************************************/

public class PowersOfTwoFor {
    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);

        // Lesa inn hæsta veldi af staðalinntaki
        int n = inntak.nextInt();
        int powerOfTwo = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
        }
    }
}
