/******************************************************************************
 *  Nafn    : Liang
 *
 *  Lýsing  : Sýnir dæmi um autoclose á skrám sem er skrifað í
 *
 *
 *****************************************************************************/
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("Vika11/nyscores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            return;
        }

        try (
                // Create a file
                PrintWriter output = new PrintWriter (file, StandardCharsets.UTF_8);
        ) {
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
