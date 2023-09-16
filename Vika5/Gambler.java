import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Random;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Dæmi byggt á Sedgewick and Wayne
 *  Lýsing  :  Forrit sem hermir eftir fjárhættuspilara í fjölda tilrauna
 *  Lesið er inn af staðalinntaki 3 heiltölur, stake, goal og trials
 *  sem segir hvað fjárhættuspilari vill leggja undir, hvað hann vill vinna og
 *  fjöldi hermana.
 *
 *  Notkun
 *  %java Gambler
 *  20 100 10000 <-- inntak
 *  996 wins of 10000 <-- úttak
 * Percent of games won = 9.96
 * Avg # bets           = 911.0956
 *****************************************************************************/

public class Gambler {
    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);

        int stake = inntak.nextInt();    // gambler's stating bankroll
        int goal = inntak.nextInt();    // gambler's desired bankroll
        int trials = inntak.nextInt();   // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        Random random = new Random();
        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (random.nextInt(10) < 5) cash++;     // win $1
                else cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}
