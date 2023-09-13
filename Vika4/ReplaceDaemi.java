/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Gerir ýmsar breytingar á streng með replace. Sýnir hvernig upprunalegi strengurinn
 *  er óbreyttur.  Sýnir hvernig tvær breytur geta "bent" á sama strenginn
 *
 *
 *****************************************************************************/

public class ReplaceDaemi {
    public static void main(String[] args) {
        String s = "aaaa";
        String samiOgS = s; // t og s innihalda vísun í sama strenginn
        System.out.println ("Fyrir replaceAll: s er "+ s + " t er " + samiOgS);
        String nyrStrengur = s.replaceAll("a", "b"); // s breytist ekki en nyrStrengur inniheldur breytingarnar
        System.out.println ("Eftir replaceAll: s er óbreyttur"+s + " samiOgS er "+ samiOgS + " nyrStrengur er "+
                nyrStrengur);

        s = s.replaceFirst ("a","x"); // Breytum fyrsta a sem kemur fyrir og setjum x - til verður nýtt minnishólf fyrir s þannig að samiOgS er óbreytt
        System.out.println ("Eftir replaceFirst: s er "+s + " samiOgS er "+ samiOgS);
    }
}
