/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Skrifar út heiti mánaðar út frá númeri hans. Númerið er fengið
 *  úr viðfangsbreytu.
 *
 *
 *****************************************************************************/

public class Manadarnofn {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        String[] MONTHS = {
                " ", "Jan", "Feb", "Mar", "Apr", "Mai", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Des"
        };
        System.out.println("Month " + m + " is " + MONTHS[m]);
    }
}
