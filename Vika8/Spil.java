import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/

public class Spil {
    // tilviksbreytur sem lýsa eiginleikum spils. nöfn að eigin vali en tög
    // final því engir setterar og ekki breytt í öðrum aðferðum en smið
    // tilviksbreytur alltaf private
    private final String sort;
    private final int gildi;

    // smiður með tveimur parametrum til að frumstilla eiginleikana (attribute)
    public Spil(String s, int g) {
        sort = s;
        gildi = g;
    }

    // getterar fyrir eiginleika
    public String getSort() {
        return sort;
    }

    public int getGildi() {
        return gildi;
    }

    // setterar óþarfi því ekki notað í main

    // Skilar samtölunni af gildum fyrir spilið s og þessu spili
    public int plus(Spil s) {
        return gildi + s.gildi;
    }

    // gefinn kóði sem leiðbeinandi um hvaða smiðir(ur) og aðferðir eru nauðsynlegar
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in, StandardCharsets.UTF_8);
        Spil s1 = new Spil(s.next(), s.nextInt());
        Spil s2 = new Spil(s.next(), s.nextInt());
        System.out.println (s1.plus(s2));
        System.out.println (s1.getSort());
        System.out.println (s2.getGildi());
    }
}
