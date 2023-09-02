import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn tvær heiltölur a og b. Ef b er minni en a þá er gildunum í a og b víxlað.
 *
 *
 *****************************************************************************/

public class Vixla {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int fyrri = inntak.nextInt();
        int seinni = inntak.nextInt();
        if (seinni < fyrri) {
            int t = fyrri;
            fyrri = seinni;
            seinni = t;
        }
        System.out.println("fyrri er " + fyrri + " seinni er " + seinni);
    }
}
