import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Skrifar út tvívítt fylki
 *
 *
 *****************************************************************************/

public class Tvivitt {
    public static void main(String[] args) {
        int[][] a = {
                { 23, 15, 33 },
                { 33, 92, 41 }
        };

        // prenta með deepToString aðferðinni á Arrays
        System.out.println(Arrays.deepToString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

