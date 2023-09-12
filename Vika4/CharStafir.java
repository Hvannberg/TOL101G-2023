/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : kasting af char yfir í int og til baka
 *
 *
 *****************************************************************************/

public class CharStafir {
    public static void main(String[] args) {
        System.out.println('b'); // b

        System.out.println ("Samskeyting við "+'b');

        System.out.println('b' + 'c'); //  197 þ.e. 98 + 99
        System.out.println((char)('b'+'c')); // A með bollu

        char aPlus4 = 'a' + 4;
        System.out.println(aPlus4); // e

        char bPlusC = 'b' + 'c';
        System.out.println(bPlusC); // A með bollu

        int aHeiltala = 'a';
        System.out.println(aHeiltala); // 97
    }
}
