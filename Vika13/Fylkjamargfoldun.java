/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Margfaldar saman tvö fylki og skrifar út útkomuna
 *
 *
 *****************************************************************************/

public class Fylkjamargfoldun {
    public static void main(String[] args) {
        int N = 3;
        double[][] a = { { 0.7, 0.2, 0.1 }, { 0.3, 0.6, 0.1 }, { 0.5, 0.1, 0.4 } };
        double[][] b = { { 0.2, 0.3, 0.5 }, { 0.1, 0.2, 0.1 }, { 0.1, 0.3, 0.4 } };
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

        for (int u = 0; u < N; u++) {
            System.out.print(c[u][0]);
            for (int v = 1; v < N; v++)
                System.out.print(", " + c[u][v]);
            System.out.println();
        }
    }
}
