import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn heiltölu og prentar út 2 ef hún er slétt
 *  en annars prentar forritið út 1.
 *
 *****************************************************************************/

public class SlettOdda {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in);
        int tala = inntak.nextInt();
        int skilabod = tala % 2 == 0 ? 2 : 1;
        System.out.println(skilabod);
    }
}
