/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Ýmis dæmi um hækkanir/lækkanir og viðbótar gildingu
 *  Kafli 2.14 og 2.15
 *  Notkunardæmi
 *
 *  %java Haekkun
 *
 * i er 5
 * i er 6
 * i er 6
 * i er 7
 *  x er 3.2
 * i er 3 k  er 2
 * i er 3 k  er 3
 * a er 7 b er 3
 *
 *****************************************************************************/

public class Haekkun {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("i er " + i); // i hefur gildið 5
        i++;
        System.out.println("i er " + i); // i hefur gildið 6
        System.out.println("i er " + i++); // prentast i
        System.out.println("i er " + i);  // i hefur gildið 7

        double x = 4.2;
        x--;
        System.out.println(" x er " + x); // x hefur gildið 3.2

        // annað dæmi
        i = 2;
        int k = i++; // Breytan k fær gildið 2, þ.e. gamla gildið á i
        System.out.println("i er " + i + " k  er " + k);

        // en hér er hækkun um einn áður en náð er í gildið
        i = 2;
        k = ++i; // Breytan fær gildið 3 því i er fyrst hækkað áður en gildið á því er sett í k
        System.out.println("i er " + i + " k  er " + k);

        int a = 2;
        int b = 4;
        a += --b + 2; // hér er lækkar b um einn áður en gildið er sótt
        System.out.println("a er " + a + " b er " + b);
    }
}
