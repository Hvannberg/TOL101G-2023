/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn heiltölur og leggur þær saman þar til talan er 0
 *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NotendastyringDo {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        int sum = 0;
        int data; // Variable will be out of scope if declared within do block
        do {
            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);     // Keep reading data until the input is 0
        System.out.println("The sum is " + sum);
    }
}
