import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : les inn ártal og skilar true ef árið er hlaupár annars false
 *
 *
 *****************************************************************************/

public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear;
        Scanner inntak = new Scanner(System.in);
        int year = inntak.nextInt();

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4 but not 100
        isLeapYear = isLeapYear && year % 100 != 0;

        // or divisible by 4 but not by 100 or divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
