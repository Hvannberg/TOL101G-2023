import java.util.ArrayList;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class TeiknaListi {

    private ArrayList<GeometricObject> teiknaListi;

    public TeiknaListi () {
        teiknaListi = new ArrayList<>();
    }

    public void add(GeometricObject go) {
        teiknaListi.add(go);
    }

    public ArrayList<GeometricObject> getTeiknaListi () {
        return teiknaListi;
    }

    public void teiknaAlla() {
        for(GeometricObject go:teiknaListi) {
            go.draw();
        }
    }

    public static void main(String[] args) {

    }


}
