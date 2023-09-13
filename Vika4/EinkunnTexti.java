import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Prentar út Frábært. Þú náðir ef nemandi fær A, Þú náðir ef hann
 *  fær B, C eða D, Þú féllst ef hann fékk F. Annars er prentað Ólögleg einkunn
 *  Notkun
 *  %java EinkunnTexti A
 *  Frábært. Þú náðir!
 *
 *****************************************************************************/

public class EinkunnTexti {
    public static void main(String[] args) {

        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);

        char eink = inntak.next().charAt(0);  // lesa inn tákn og ná í fyrsta stafinn
        switch (eink) {
            case 'A':
                System.out.print("Frábært. ");
                System.out.println("Þú náðir!");
                break;
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Þú náðir!");
                break;
            case 'F':
                System.out.println("Þú féllst");
                break;
            default:
                System.out.println("Ólögleg einkunn");
        }
    }
}
