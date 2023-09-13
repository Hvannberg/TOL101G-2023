import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn nafn á skrá og prentar út forskeytið og endinguna sérstaklega
 *
 *  Notkun:
 *  %java SkraButar
 *  ReplaceDaemi.java
 *  Replace
 *  java
 *
 *****************************************************************************/

public class SkraButar {
    public static void main(String[] args) {

        // Lesa inn nafn á skrá
        System.out.println ("Skrifaðu nafn á skrá ");
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        String skraaNafn = inntak.next();

        int punkturIndex = skraaNafn.indexOf("."); // í hvaða sæti er punktur
        String forskeyti = skraaNafn.substring (0, punkturIndex); // forskeytið fundið
        String ending = skraaNafn.substring (punkturIndex+1); // endingin fundin, til index er sjálfgefinn út á enda

        // prenta forskeyti og endingu
        System.out.println (forskeyti);
        System.out.println(ending);
    }
}
