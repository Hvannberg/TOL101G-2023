/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn tvær heiltölur og ber þær saman
 *
 *  Notkun:
 *  %java Samanburdur2Tolur
 * 6 3
 * 6 > 3:true
 * 6 < 3:false
 * 6 != 3:true
 * 6 == 3:false
 * 6 er deilanleg með 3:true
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Samanburdur2Tolur {
    public static void main(String[] args) {
        // Setjum upp lestrarstrauminn
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        // Lesa inn tvær tölur
        int tala1 = inntak.nextInt();
        int tala2 = inntak.nextInt();
        // Prenta út true ef tala1 > tala2 - annars false o.s.frv. fyrir aðra samanburðarvirkja
        System.out.println(tala1 + " > " + tala2 + ":" + (tala1 > tala2));
        System.out.println(tala1 + " < " + tala2 + ":" + (tala1 < tala2));
        System.out.println(tala1 + " != " + tala2 + ":" + (tala1 != tala2));
        System.out.println(tala1 + " == " + tala2 + ":" + (tala1 == tala2));
        System.out.println (tala1 + " er deilanleg með " + tala2 + ":" + (tala1 % tala2 == 0));
    }
}
