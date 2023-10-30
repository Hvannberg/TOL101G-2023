/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        // Scanner smíðaður og hann notaður til að lesa streng
        String URLString = new Scanner(System.in, StandardCharsets.UTF_8).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream(), StandardCharsets.UTF_8);
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }
        catch (IOException e) {
            System.out.println("IO Errors");
        }
    }
}
