import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Forritið les inn setningu, athugar hvort má lesa hana eins
 *  aftur og áfram. Prentar út niðurstöðu
 *
 *  Notkun
 *  %java Palindrome
 *  amma <-- inntak
 *  amma er palindrome  <-- úttak
 *
 *****************************************************************************/

public class Palindrome {
    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        String setning = inntak.nextLine();
        int n = setning.length();
        boolean erPalindrome=true;
        for (int i = 0; i < n / 2; i++) {
            if (setning.charAt(i) != setning.charAt(n - 1 - i)) {
                erPalindrome = false;
                break;  // Hér er notað break en það er oftast hægt að umskrifa
            }
        }
        String uttak = erPalindrome ? " er palindrome" : " er ekki palindrome";
        System.out.println (setning + uttak);
    }
}
