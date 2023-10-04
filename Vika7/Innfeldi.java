/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Reiknar innfeldi (dot product) af tveimur fylkjum
 *
 *
 *****************************************************************************/

public class Innfeldi {
    public static void main(String[] args) {
        double[] x = { 0.3, 0.6, 0.1 };
        double[] y = { 0.5, 0.1, 0.4 };
        int N = x.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum = sum + x[i] * y[i];
        }
        System.out.println(sum);
    }
}
