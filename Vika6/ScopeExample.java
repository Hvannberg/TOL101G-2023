/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um gildissvið (e. scope)
 *  Kafli 6
 *
 *
 *****************************************************************************/

public class ScopeExample {
    public static void main(String[] args) {
    }

    public static void adferdA() {
        //  int i=4; // næsta skilgreining á i verður ólögleg ekki má skilgreina breytu
                     // í hreiðraðri blokk
        for (int i = 0; i < 3; i++) {
            // i er skilgreind og hefur gildi inni í blokkinni
            System.out.print(i + " ");
        }
        System.out.println(" \nÁ undan næstu for-lykkju");
        // i er ekki skilgreind hér

        for (int i = 0; i < 5; i++) {
            //  er skilgreind aftur hér og hefur gildi inni í blokkinni
            System.out.print(2 * i + " ");
        }

        // i er ekki skilgreind hér
        // hér má skilgreina i því i breyturnar hér að ofan eru utan gildissviðs þeirra
        int i = 3;
        System.out.println("\ni í main aðferð " + i);
    }
}
