import java.awt.Color;
import java.awt.Point;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasi sem er hringur með miðju og lit. hringur getur teiknað sjálfan
 *  sig
 *
 *
 *****************************************************************************/

public class CircleLitur {

    // klasabreyta
    private static Random random = new Random(); // random generator
    // tilviksbreytur
    private double radius = 1;  // sjálfgefið gildi tilviksbreytu
    private Point midja = new Point(0, 0); // miðja hrings
    private Color litur = new Color(0, 0, 0); // litur hrings

    // smiður með sjálfgefnum radíus
    public CircleLitur() {

    }

    /**
     * Smíðar hlut af klasanum og skilar honum
     *
     * @param newRadius radíus hringsins
     */
    public CircleLitur(double newRadius) {
        radius = newRadius;     // radíus hlutarins verður gildið úr parameter
    }

    public CircleLitur(CircleLitur afrit) {
        radius = afrit.radius;     // radíus nýja hlutarins verður gildið úr afrit hlutnum
        midja = afrit.midja;
        litur = afrit.litur;
    }

    /**
     * Smiður fyrir hring með radíus, lit og miðju
     * @param radius radíus hrings
     * @param litur litur hrings
     * @param p miðja hrings
     */
    public CircleLitur(int radius, Color litur, Point p) {
        this.litur = litur;
        this.radius = radius;
        this.midja.x = p.x;
        this.midja.y = p.y;
    }

    /**
     * Reiknar út ummál hrings og skilar því
     *
     * @return ummál hrings
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Reiknar flatarmál hrings og skilar því
     *
     * @return flatarmál hrings
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // get og set aðferðir - þarf ekki að skjala - Búið til með Alt-Insert
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // sýnir gildi hlutarins
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    /**
     * Teiknar hringinn á canvas sem þegar er búið til
     * Forskilyrði: Búið er að búa til canvas
     */
    public void draw() {
        StdDraw.setPenColor(litur);
        StdDraw.filledCircle(midja.x, midja.y, radius);
    }

    /**
     * Teknar eru tvær tölur af skipanalínu, fjöldi hringja sem á að teikna og
     * radíus hringjanna
     * @param args fjöldi og radíus hringjanna
     */
    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);

        final int FJOLDI = Integer.parseInt(args[0]);
        final int RADIUS = Integer.parseInt(args[1]);
        final int N = 500;
        final int MAX = 256;
        StdDraw.setCanvasSize(N, N); // Teikniflöturinn er N x N
        StdDraw.setScale(0, N); // Skalinn er frá 0 til N í báðum víddum

        // geyma hringina í fylki
        CircleLitur [] margirHringir = new CircleLitur [FJOLDI];
        for (int i = 0; i < FJOLDI; i++) {

            // Búinn er til CircleLitur hlutur með radíus RADIUS, slembilit og slembimiðju

            CircleLitur circle = new CircleLitur(RADIUS, new Color(random.nextInt(MAX),
                                                                   random.nextInt(MAX),
                                                                   random.nextInt(MAX)),
                                                 new Point(random.nextInt(N),
                                                           random.nextInt(N)));
            // Setja hring í fylki
            margirHringir[i] = circle;
            circle.draw();
        }
        //
        System.out.print ("Viltu hreinsa teikninguna? ");
        String svar = inntak.next();
        if (svar.equals ("já")) {
            StdDraw.clear();
        }

        // Birta sömu teikningu aftur
        System.out.print ("Viltu birta teikninguna? ");
        svar = inntak.next();
        if (svar.equals ("já")) {
            for (int i=0; i<FJOLDI; i++) {
                margirHringir[i].draw();
            }
        }

    }
}
