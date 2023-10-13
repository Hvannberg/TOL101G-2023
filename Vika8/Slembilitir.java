import java.awt.Color;
import java.util.Random;
/******************************************************************************
 *  Nafn    :
 *  T-póstur:
 *
 *  Lýsing  : Býr til slembiliti og teiknar í ferninga.
 *
 *
 *****************************************************************************/

public class Slembilitir {
    static Random random = new Random();

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // tekur tölu inn af skipanalínu
        // setur stærðina á málverkinu
        StdDraw.setCanvasSize(500, 500);

        for (int i = 0; i < N; i++) {
            // finnur random tölur 0 og upp í 255 fyrir litina
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            Color c = new Color(r, g, b);
            StdDraw.setPenColor(c);

            // finnur staðsetninguna á miðjuna á ferningnum
            double x = random.nextDouble();
            double y = random.nextDouble();
            StdDraw.filledSquare(x, y, 0.03);
        }
    }
}
