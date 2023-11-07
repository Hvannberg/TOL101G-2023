import java.awt.Color;

/******************************************************************************
 *  Compilation:  javac FunctionGraph.java
 *  Execution:    java FunctionGraph a b
 *  Dependencies: StdStats.java
 *
 *  Plots the function f in the interval [a, b].
 *
 *  % java ReiknaPlot -4 4
 *
 ******************************************************************************/

public class ReiknaPlot {

    // plots the function f in the interval [a, b] using n+1 evenly spaced points
    public static void plot(ReiknaFall f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.reikna(a + delta * i);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }


    // sample client program
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        // Function f = new GaussianPDF();

        ReiknaFall fallSquare = new Square();
        plot(fallSquare, a, b, 100);
        StdDraw.setPenColor(Color.RED);
        ReiknaFall fallLinear = new Linear();
        plot(fallLinear, a, b, 100);
}
