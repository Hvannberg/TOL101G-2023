/******************************************************************************
 *  Nafn    : Liang
 *
 *  Lýsing  : Les gögn úr skránni Vika11/scores.txt
 *  Lesin eru 3 textasvið og svo eitt heiltölusvið. Þetta er prentað út
 *  á staðalúttak
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.File;

public class ReadData {
    public static void main(String[] args) throws Exception {
        // Create a File instance
        File file = new File("Vika11/scores.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file, StandardCharsets.UTF_8);

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
        }

        // Close the input file
        input.close();
    }
}
