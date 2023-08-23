/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Forrit sem sýnir heiltöludeilingu og umbreytingu (casting)
 *
 *
 *****************************************************************************/

public class Umbreyting {
    public static void main(String[] args) {
        int a, b, c;    // Skilgreining breyta
        // Upphafsstilling
        b = 3;
        a = 1;
        c = 1;
        // heiltöludeiling - löglegt en aðvörun
        double d = b / 2 - 4.0 * a * c;
        System.out.println(d);

        double ax = 2.0;
        int i = 3;
        //  int y = ax + i;   Þessi setning gefur villu í þýðingu
        // umbreyting frá kommutölu yfir í heiltölu
        int x = (int) (ax + i);
        System.out.println(x);

        // óþarfa umbreyting í double - niðurstaðan er núll
        double xy = (double) (3 / 5);

        System.out.println(xy);

    }
}
