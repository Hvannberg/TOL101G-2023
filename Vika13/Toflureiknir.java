/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Töflureiknir sem geymir einkunnir 10 nemenda í þremur verkefnum.
 *            Reiknar út meðaltal hvers verkefnis og meðaltal hvers nemanda í
 *            verkefnunum. Skrifar út niðurstöðurnar.
 *
 *
 *****************************************************************************/

public class Toflureiknir {
    public static void main(String[] args) {
        double[][] a = {
                { 99.0, 85.0, 98.0, 0.0 },
                { 98.0, 57.0, 79.0, 0.0 },
                { 92.0, 77.0, 74.0, 0.0 },
                { 94.0, 62.0, 81.0, 0.0 },
                { 99.0, 94.0, 92.0, 0.0 },
                { 80.0, 76.5, 67.0, 0.0 },
                { 76.0, 58.5, 90.5, 0.0 },
                { 92.0, 66.0, 91.0, 0.0 },
                { 97.0, 70.5, 66.5, 0.0 },
                { 89.0, 89.5, 81.0, 0.0 },
                { 0.0, 0.0, 0.0, 0.0 }
        };

        int M = 10;
        int N = 3;
        // summa yfir dálkana og setja meðaltalið í síðasta dálkinn
        for (int i = 0; i < M; i++) {
            double sum = 0.0;
            for (int j = 0; j < N; j++)
                sum += a[i][j];
            a[i][N] = (int) Math.round(sum / N);
        }
        // summa yfir línurnar og setja meðaltalið í síðustu línuna
        for (int j = 0; j < N; j++) {
            double sum = 0.0;
            for (int i = 0; i < M; i++)
                sum += a[i][j];
            a[M][j] = (int) Math.round(sum / M);
        }

        // prenta út fylkið
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
