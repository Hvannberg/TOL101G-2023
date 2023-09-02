import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn heiltölu x og prentar út 4 ef x > 3, 1 ef x < -1 og
 *  hefur x í annað veldi annars. Dæmi um hreiðraða if-setningu
 *
 *
 *****************************************************************************/

public class If2 {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int x = inntak.nextInt();
        int y;

        if (x < -1) {
            y = 1;
        }
        else if (x <= 2) {
            y = x * x;
        }
        else {
            y = 4;
        }
        System.out.println(y);
    }
}
