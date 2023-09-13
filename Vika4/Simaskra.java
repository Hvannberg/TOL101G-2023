/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn nöfn úr símaskrá, hér tvö nöfn og athugar hvort nöfnin
 *  eru í stafrófsröð og prentar út viðeigandi texta
 *
 *  Notkun
 *  %java Simaskra
 *  Blær Jónsson
 *  Sæunn Baldursdóttir
 *  Rétt stafrófsröð <-- úttak
 *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Simaskra {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        String nafn1 = inntak.nextLine();
        String nafn2 = inntak.nextLine();

        if (nafn1.compareTo(nafn2) < 0) {
            System.out.println("Rétt stafrófsröð");
        }
        else if (nafn1.compareTo(nafn2) > 0) {
            System.out.println("Ekki rétt stafrófsröð");
        }
        else {
            System.out.println("Sama nafn");
        }
    }
}
