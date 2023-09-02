import java.util.Random;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um slembitölur með Math klasanum og Random klasanum
 *
 *
 *****************************************************************************/

public class Slembitolur {
    public static void main(String[] args) {
        final int SEED = 5;
        final int EFRI = 10;
        int slembi = (int) (Math.random() * EFRI); // skilar slembitölu á bilinu 0 til 9
        System.out.println("Slembitala úr Math klasanum " + slembi);
        Random r = new Random();  // Búa til nýjan Random hlut
        int slembiHeiltala = r.nextInt(EFRI);   // skilar næstu slembiheiltölu á bilinu 0 til 9
        System.out.println("Slembitala úr Random klasanum " + slembiHeiltala);
        double slembiKommutala = r.nextDouble();  // Skilar double tölu á bilinu >=0.0 og <1.0
        System.out.println("Kommuslembitala úr Random klasanum " + slembiKommutala);

        r = new Random(SEED); // Búa til nýjan Random hlut með seed 5
        slembiKommutala = r.nextDouble();  // Skilar double tölu á bilinu >=0.0 og <1.0;
        System.out.println(
                "Kommuslembitala úr Random klasanum með seed " + SEED + " er " + slembiKommutala);
    }
}
