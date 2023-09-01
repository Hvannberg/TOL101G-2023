import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn tvær kommutölur af console, hitastig og vindhraða, t og v.
 *  Reiknar út vindkælingu miðað við hita í celsíusgráðum og vindhraða
 *  í km/kls. Inntak er t og v. Prentar út hitastig vindhraða og vindkælingu.
 *  Formúlan er 13.12 + 0.6215t - 11.37v~0.16 + 0.3965tv~0.16
 *
 *  Notkun:
 *  %java WindChill
 *  10,5 16,7 <--inntak
 * Temperature = 10.5 C <--úttak byrjar
 * Wind speed  = 16.7 km/h
 * Wind chill  = 8.34205483560224
 *
 *****************************************************************************/

public class WindChill {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);

        double temperature = inntak.nextDouble();
        double windSpeed = inntak.nextDouble();

        double windChill = 13.12 + 0.6215 * temperature +
                (0.3965 * temperature - 11.37) * Math.pow(windSpeed, 0.16);

        System.out.println("Temperature = " + temperature + " C");
        System.out.println("Wind speed  = " + windSpeed + " km/h");
        System.out.println("Wind chill  = " + windChill);
    }
}
