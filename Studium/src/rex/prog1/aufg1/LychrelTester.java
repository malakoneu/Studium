package rex.prog1.aufg1;

/**
 * 
 * Eine Klasse um zu testen, ob eine Zahl eine Lychrel Zahl ist.
 * 
 * @author Rene Kudlek, 4719142, Gruppe 4a
 *
 */

public class LychrelTester {
    /**
     * @param args erlaubt es über die Komandozeile einen Eingabewert zu übergeben
     */
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long sum = n;
        long m, sum2;

        do {
            // Teilt m invertiert sum zu
            m = Long.parseLong((new StringBuilder("" + sum).reverse().toString()));

            // Teilt sum2 invertiert sum + m zu
            sum = m + sum;
            
            if (sum < 0) {
                break;
            }
            sum2 = Long.parseLong((new StringBuilder("" + sum).reverse().toString()));

            if (sum == sum2) {
                System.out.println("Die Nummer ist keine Lychrel Nummer!");
                return;
            }

        } while (sum > 0);

        System.out.println("Die Nummer ist wahrscheinlich eine Lychrel Nummer.");
    }
}
