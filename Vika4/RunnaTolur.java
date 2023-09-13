/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Ýmsar setningar til að rúnna tölur
 *
 *
 *****************************************************************************/

public class RunnaTolur {
    public static void main(String[] args) {
        System.out.println(Math.round (-2.6)); // skilar -3 - athugið að aðferðin skilar long
        System.out.println(Math.rint(3.5)); // skilar 4.0 - rúnnar töluna en þessi aðferð skilar double
        System.out.println(Math.floor (-2.7)); // skilar -3.0 - næsta tala lægri en -2.7
        System.out.println(Math.ceil (-2.1)); //  skilar -2.0 - næsta tala hærri en -2.1
    }
}
