/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn heiltölu og birtir staðfestingu á að inntak hafi verið
 *  slegið inn. Ef notandi sló ekki inn heiltölu þá birtit Inntak verður að vera heiltala
 *  Ef notandi sló ekkert inntak inn þá birtit Inntak vantar: sláðu inn heiltölu
 *  Prófaðu að keyra t.d. með eftirfarandi inntaki og að sleppa inntaki alveg
 *  3
 *  5.0
 *
 *****************************************************************************/

public class TestEkkertInntak {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("Notandi sló inn tölu á skipanalínu " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Inntak verður að vera heiltala " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inntak vantar: sláðu inn heiltölu");
        }
    }
}

