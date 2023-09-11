/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Sýnir dæmi um notkun á \n og hvernig má skrifa út tákn með Escape character \
 *
 *
 *****************************************************************************/

public class NyLina {
    public static void main(String[] args) {
        System.out.print(" Á eftir strengnum kemur ný lína \n");
        System.out.print(
                " Táknið er skrifað út \\n"); // hér verður ekki ný lína því notað er öfugt skástrik sem forskeyti
        System.out.print(" engin ný lína");
    }
}
