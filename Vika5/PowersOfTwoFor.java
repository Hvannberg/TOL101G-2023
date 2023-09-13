/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :  Reiknar út veldi af tveimur
 *
 *
 *****************************************************************************/

public class PowersOfTwoFor {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int powerOfTwo = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
        }
    }
}
