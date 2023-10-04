/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Skrifaðu klasann Dog sem hefur tvær aðferðir sleep og eat.
 *  Þær taka ekki inn neina parametra og skila engu. Þegar dog sefur (sleep)
 *  þá safnar hann kröftum en þegar hann étur þá gengur á forðann.
 *  Þess vegna hefur hann einn private eiginleika sem heitir resource
 *  sem er hækkaður um einn þegar hann sefur og lækkaður um einn þegar hann étur.
 *  Ljúkið við að forrita klasann þannig að main fallið smíði 2 hunda. Hundur 2
 *  étur á meðan hundur 1 sefur. Hundur 2 sefur á meðan hundur 1 étur.
 *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Dog {
    // forritið tilviksbreytu
    private int orka;   // orka hundsins

    // forritið aðferðir

    /**
     * Þegar hundur sefur safnar hann orku
     */
    public void sleep() {
        orka++;
    }

    /**
     * þegar hundur étur eyðir hann orku
     */
    public void eat() {
        orka--;
    }

    /**
     * Endurskilgreinir toString aðferðina
     *
     * @return streng af innihaldi hlutarins
     */
    @Override
    public String toString() {
        // forritið hér
        return "{" + orka + "}";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Hvað viltu að hundur1 sofi lengi? ");
        int sefur = s.nextInt();
        System.out.print("Hvað viltu að hundur1 éti lengi? ");
        int etur = s.nextInt();

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        for (int i = 0; i < sefur; i++) {
            d1.sleep();
            d2.eat();
        }
        for (int i = 0; i < etur; i++) {
            d1.eat();
            d2.sleep();
        }
        System.out.println("hundur 1 " + d1);
        System.out.println("hundur 2 " + d2);
    }
}
