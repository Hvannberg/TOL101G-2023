import java.util.Locale;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Ýmis dæmi með sniðnu úttaki
 *
 *
 *****************************************************************************/

public class Forsnidid {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "PI er u.þ.b. %.2f\n", Math.PI);

        double verd = 535.5;
        System.out.printf(Locale.US, "Verðið er %.2f krónur\n", verd);

        String month = "Jan";
        double pay = 190.0;
        System.out.printf("%s $%6.2f\n", month, pay);
    }
}
