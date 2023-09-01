/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Prófdæmi frá miðmisserisprófi 2019
 *  Kafli 2.14 og 2.15
 *
 *  Notkunardæmi
 *  %java HaekkunProfdaemi
 *  a er 6 b er 5
 *****************************************************************************/

public class HaekkunProfdaemi {
    public static void main(String[] args) {
        int a, b;
        b = 2;
        a = b-- + 3;
        b = ++a - b;
        System.out.println("a er " + a + " b er " + b);
    }
}
