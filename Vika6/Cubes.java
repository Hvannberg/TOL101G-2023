import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/

public class Cubes {
    public static int cube(int i) {
        return i * i * i;
    }

    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i + " " + cube(i));
        }
    }
}
