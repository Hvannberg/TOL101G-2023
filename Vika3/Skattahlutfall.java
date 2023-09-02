import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Finnur skattahlutfall (skattaþrep) fyrir tekjur og skrifar út.
 *            Tekjur eru fengnar af console.
 *
 *  Notkun:
 *  %java Skattahlutfall
 *  200000
 *  Skattahlutfallið fyrir tekjur 200000 er 0.33
 *
 *****************************************************************************/

public class Skattahlutfall {
    public static void main(String[] args) {
        // fastar
        final double FYRSTA = 0.22, ANNAD = 0.25, THRIDJA = 0.28, FJORDA = 0.33, FIMMTA = 0.35;
        final double T_1 = 47450, T_2 = 114650, T_3 = 174700, T_4 = 311950;
        // lesa inn gögnin
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int tekjur = inntak.nextInt();

        double skattahlutfall;
        if (tekjur < T_1) {
            skattahlutfall = FYRSTA;
        }
        else if (tekjur < T_2) {
            skattahlutfall = ANNAD;
        }
        else if (tekjur < T_3) {
            skattahlutfall = THRIDJA;
        }
        else if (tekjur < T_4) {
            skattahlutfall = FJORDA;
        }
        else {
            skattahlutfall = FIMMTA;
        }
        System.out.println("Skattahlutfallið fyrir tekjur " + tekjur + " er " + skattahlutfall);
    }
}


