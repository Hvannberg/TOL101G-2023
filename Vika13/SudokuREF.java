/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Sudoku - kafli 8 Byggt á lausn frá Liang
 *
 *
 *****************************************************************************/

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SudokuREF {
    public static void main(String[] args) {
        // lesa inn Sudoku lausn
        try {
            int[][] bord = lesaSudokuLausn(args[0]);
            System.out.println(erLogleg(bord) ? "Lausn er lögleg" :
                               "Lausn er ólögleg");
        }
        catch (IOException e) {
            System.out.println("Skráin " + args[0] + " er ekki til");
        }
    }

    /**
     * Skoðar hvort sudoku borð er löglegt.
     *
     * @param bord sudoku borðið
     * @return true ef borðið er lögleg annars false
     */
    private static boolean erLogleg(int[][] bord) {
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[0].length; j++) {
                if (bord[i][j] < 1 || bord[i][j] > 9 ||
                        !erLogleg(i, j, bord)) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Athugar hvort dálkur i, röð j og umlykjandi blokk sellu i, j á sudoku borði sé lögleg
     *
     * @param i    röðin
     * @param j    dálkurinn
     * @param bord sudoku borðið
     * @return true ef löglegt annars false
     */
    private static boolean erLogleg(int i, int j, int[][] bord) {
        // athugið hvort bord[i][j] er lögleg í röð i

        if (!erLogleg(j, bord[i])) {
            return false;
        }
        // athugum hvort bord [i][j] er lögleg í dálki j
        if (!erLogleg(i, sliceColumn(bord, j))) {
            return false;
        }

        // athugum hvort bord [i][j] er lögleg í blokkinni
        if (erLoglegBlokk(i, j, bord)) return false;
        return true;
    }

    /**
     * Athugar hvort bord af i, j er lögleg í blokkinni
     *
     * @param i    röðin
     * @param j    dálkurinn
     * @param bord sudoku borðið
     * @return true ef löglegt annars false
     */
    private static boolean erLoglegBlokk(int i, int j, int[][] bord) {
        for (int rod = i / 3 * 3; rod < i / 3 * 3 + 3; rod++) {
            for (int dalkur = j / 3 * 3; dalkur < j / 3 * 3 + 3; dalkur++) {
                if (!(rod == i && dalkur == j) && bord[rod][dalkur] == bord[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Sker dálkinn dalkur úr tvívíða fylkinu bord
     *
     * @param bord   tvívítt fylki
     * @param dalkur dálkurinn
     * @return einvítt fylki sem inniheldur dálkinn
     */
    private static int[] sliceColumn(int[][] bord, int dalkur) {
        int[] fylki = new int[bord.length];
        for (int i = 0; i < fylki.length; i++) {
            fylki[i] = bord[i][dalkur];
        }
        return fylki;
    }

    /**
     * Athugar hvort sella fylki[j] sé lögleg í fylkinu
     * @param j sætisvísir í fylki
     * @param fylki einvítt fylki
     * @return true ef fylki[j] er löglegt annars false
     */
    private static boolean erLogleg(int j, int[] fylki) {
        for (int i = 0; i < fylki.length; i++) {
            if (i != j && fylki[i] == fylki[j]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Les sudoku borð úr skrá með nafni skraanafn og skilar borðinu Kastar IOException
     *
     * @param skraanafn nafnið á skránni
     * @return skilar sudokuborði
     * @throws IOException ef það verður inntaks frábrigði, t.d. skráin skraanafn er ekki til
     */
    private static int[][] lesaSudokuLausn(String skraanafn) throws IOException {
        File file = new File(skraanafn);
        Scanner inntak = new Scanner(file, StandardCharsets.UTF_8);
        int[][] bord = new int[9][9];
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                bord[i][j] = inntak.nextInt();
            }
        }
        return bord;
    }
}
