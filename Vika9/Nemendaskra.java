import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  :Nemendaskrá skóla sem hefur nafn skóla, fjölda nemenda hverju sinni,
 *  nemendalista
 *
 *
 *****************************************************************************/

public class Nemendaskra {
    private String nafnSkola;
    private int fjoldiNemenda = 0; // næsta lausa pláss
    private Nemandi[] nemendur;

    public Nemendaskra(String nafnSkola, int fjoldi) {
        this.nafnSkola = nafnSkola;
        nemendur = new Nemandi[fjoldi];
    }

    /**
     * forskilyrði: það er pláss fyrir einn nemanda í viðbót
     * eftirskilyrði: nemandi er bætt við í skólann - jafnvel þó hann sé enn á skrá
     * @param nemandi sem á að skrá í skólann
     */
    public void skraNemanda(Nemandi nemandi) {
        nemendur[fjoldiNemenda++] = nemandi;
    }

    /**
     * eftirskilyrði: ef nemandinn er á skrá þá er einum færri nemendur og nemandinn
     * er ekki lengur á skrá
     *
     * @param nemandi nemandinn sem á að úrskrá
     * @return true ef nemandinn var skráður úr skólanum annars false
     */
    public boolean urskraNemanda(Nemandi nemandi) {
        for (int i = 0; i < fjoldiNemenda; i++) {
            if (nemandi.equals(nemendur[i])) {
                eyda(i);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Skilar true ef það er laust pláss í skólanum annars false
     */
    public boolean erLaustPlass() {
        return fjoldiNemenda < nemendur.length;
    }

    /**
     * Eyðir staki sem er í saeti úr fylkinu og færir alla fyrir ofan niður um einn
     *
     * @param saeti sæti staksins sem á að eyða
     */
    private void eyda(int saeti) {
        for (int i = saeti; i < fjoldiNemenda - 1; i++) {
            nemendur[i] = nemendur[i + 1];
        }
        fjoldiNemenda--;


    }

    public String nemendalisti() {
        String listi="";
        for (int i=0;i<fjoldiNemenda;i++ ) {
            listi += nemendur[i]+ "\n";
        }
        return listi;
    }

    public String toString() {
        return "Nemendaskra{" +
                "nafnSkola='" + nafnSkola + '\'' +
                ", fjoldiNemenda=" + fjoldiNemenda +
                ", hamarksfjoldi=" + nemendur.length + "\n" +
                ", nemendur=" + Arrays.toString(nemendur) +
                '}';
    }

    public static void main(String[] args) {

    }
}
