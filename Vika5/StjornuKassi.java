import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Skrifar út m stjörnur í n línur. n og m eru fengnar úr
 *            viðfangsbreytum
 *
 *
 *****************************************************************************/

public class StjornuKassi {
    public static void main(String[] args) {

        // lesa inn tölur n og m
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();
        int m = inntak.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
