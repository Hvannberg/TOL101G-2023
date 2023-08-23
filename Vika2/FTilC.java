import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn hitastig í Fahrenheit (heiltala) frá console
 *  og skilar út í Celcíus á staðalúttaki
 *
 *****************************************************************************/

public class FTilC {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int fahrenheit = inntak.nextInt();
        int celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celcius);
    }
}
