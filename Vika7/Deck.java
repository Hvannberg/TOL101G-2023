/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Stokkar spilastokk
 *
 *
 *****************************************************************************/
import java.security.SecureRandom;
public class Deck {
    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"
        };
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

        int SUITS = suit.length;
        int RANKS = rank.length;
        int N = SUITS * RANKS;

        String[] deck = new String[52];
        for (int i = 0; i < RANKS; i++)
            for (int j = 0; j < SUITS; j++)
                deck[SUITS * i + j] = rank[i] + " of " + suit[j];

        for (int i = 0; i < N; i++) {        // að síðasta spili
            int r = random.nextInt(N-i) + i; // draga spil úr stokknum frá núverandi spili og að því síðasta (N-1)
                                             // fyrsta slembitalan er á bilinu 0 og að nextInt(N)+0
                                            // r er síðast  N-1 og i er N-1
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }
        for (int i = 0; i < N; i++)
            System.out.println(deck[i]);
    }
}
