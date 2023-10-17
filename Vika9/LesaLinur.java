import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn línur úr skrá, skiptir hverri línu í tvennt og notar
 *  kommu sem aðgreinir
 *  Notkunardæmi:
 *  java LesaLinur <nemendur.txt
 *  nafn ?Ebba Þóra Hvannberg t-póstur ebba@hi.is
 * nafn Jón Jónsson t-póstur dj3@hi.is
 * nafn Ebba Þóra Hvannberg t-póstur ebba@hi.is
 * nafn Bjarney Bjarneyjardóttir t-póstur bs3@hi.is
 * nafn Guðrún Jónsdóttir t-póstur er9@hi.is
 * nafn Bjarni Jónsson t-póstur b1@hi.is
 * nafn Guðrún Jónsdóttir t-póstur er9@hi.is
 *
 *****************************************************************************/

public class LesaLinur {
    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        while (inntak.hasNextLine()) {
            String lina = inntak.nextLine();
            String gogn[] = lina.split(",");
            System.out.println("nafn " + gogn[0] + " t-póstur " + gogn[1]);
        }
    }
}
