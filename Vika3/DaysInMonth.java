import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Finnur hver fjöldi daga í mánuði er. Mánuður og ár eru fengin
 *  úr staðalinntaki. Fjöldi daga er skrifaður út. Ef ólöglegur mánuður er í
 *  viðfangsbreytunni er skrifuð út villumelding og fjöldi daga er 0.
 *  Notkun:
 *
 *  %java DaysInMonth
 *  2 2000
 *  29
 *
 *  %java DaysInMonth
 *  9 2023
 *  30
 *****************************************************************************/

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int month = inntak.nextInt();
        int year = inntak.nextInt();
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                // Ef ár er deilanlegt með 4 og ár er ekki  aldamótaár (deilanlegt með 100) eða
                // ár er deilanlegt með 400 þá er hlaupaár
                if (year % 4 == 0 && year % 100 != 0 // skoðið forgangsröðin á virkjunum
                        || year % 400 == 0)          // reiknivirkjar fyrst, samanburðurðarvirkjar, rökvirkjar
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
        }
        System.out.println(numDays);
    }
}
