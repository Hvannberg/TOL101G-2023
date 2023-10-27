/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : client forrit fyrir TeiknaListi. Býr til hringi og rétthyrninga,
 *  setur á lista og teiknar
 *
 *****************************************************************************/

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class ClientTeiknaListi {
    // klasabreyta
    private static Random random = new Random(); // random generator
    public static final int N = 500;
    public static final int MAX = 256;

    /**
     * Clientforrit sem teiknar slembihringi og slembirétthyrninga í slembilit á
     * slembistað. Fjöldi hluta er lesinn inn af skipanalínu
     * @param args fjöldi hluta sem á að búa til og teikna
     */
    public static void main(String[] args) {
        final int FJOLDI = Integer.parseInt(args[0]);
        // setja upp teikniflötinn
        StdDraw.setCanvasSize(N, N); // Teikniflöturinn er N x N
        StdDraw.setScale(0, N); // Skalinn er frá 0 til N í báðum víddum
        // geyma hringina og rétthyrningana í lista
        TeiknaListi listi = new TeiknaListi();
        // Býr til slembihringi
        for (int i = 0; i < FJOLDI; i++) {
            // Búinn er til Circle eða Rectangle hlutur
            boolean circleOrRectangle = random.nextBoolean();
            // ef ég fékk true þá
            if (circleOrRectangle) {
                // bý ég til Circle hlut
                // og bæti honum á listi
                listi.add(new Circle(getRandomPoint(random, N), 15, getRandomColor(), random.nextBoolean()));
            }
            // annars
            else {
                // bý ég til rétthyrning
                // og bæti honum á listi
                listi.add(new Rectangle(getRandomPoint(random, N), 30, 50, getRandomColor(),
                                        random.nextBoolean()));
            }
        }
        // Teikna alla hlutina á listanum
        listi.teiknaAlla();
    }

    /**
     * Býr til slembilit
     * @return skilar litnum
     */
    private static Color getRandomColor() {
        return new Color(random.nextInt(MAX),
                         random.nextInt(MAX),
                         random.nextInt(MAX));
    }

    /**
     * Býr til slembipunkt sem er minni en N
     * @param random slembivél
     * @param N hámark x, y
     * @return punktinumm
     */
    private static Point getRandomPoint(Random random, int N) {
        return new Point(random.nextInt(N),
                         random.nextInt(N));
    }
}
