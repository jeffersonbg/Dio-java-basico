import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Number valor = null;

        // System.out.println(valor);
        try {            
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
