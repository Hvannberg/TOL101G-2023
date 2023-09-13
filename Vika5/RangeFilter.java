import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac RangeFilter.java
 *  Execution:    java RangeFilter lo hi < input.txt
 *
 *  Read in a sequence of integers from standard input and print
 *  out those values between lo and hi.
 *
 ******************************************************************************/

public class RangeFilter {
    public static void main(String[] args) {

        // read in two numbers lo and high
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int lo = inntak.nextInt();
        int hi = inntak.nextInt();



        // repeat as long as there's more input to read in
        while (inntak.hasNext()) {

            // read in the next integer
            int t = inntak.nextInt();

            // print out the given integer if it's between lo and hi
            if (t >= lo && t <= hi) {
                System.out.println(t + " ");
            }
        }
        System.out.println();
    }
}
