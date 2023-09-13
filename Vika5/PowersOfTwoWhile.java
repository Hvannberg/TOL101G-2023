/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :  Les in n af skipanalínu Reiknar út töflu með veldi af tveimur upp
 *  í n. n verður að vera minni en 31 því annars flæðir heiltalan yfir.
 *
 *
 *****************************************************************************/

public class PowersOfTwoWhile {
    public static void main(String[] args) {

        // Lesa inn hæsta veldi af skipanalínu
        int n = Integer.parseInt(args[0]);

        int i = 0;                // teljari frá 0 til n
        int powerOfTwo = 1;       // i-ta veldið af tveimur

        // endurtaka á meðan i er minna eða jafnt og n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // prenta út niðurstöðu
            powerOfTwo = 2 * powerOfTwo;                // reikna út næsta veldi
            i = i + 1;                                  // hækka teljarann
        }
    }
}
