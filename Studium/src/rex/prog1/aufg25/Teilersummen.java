package rex.prog1.aufg25;

public class Teilersummen {

    static int getTeilerSummen(int eingabe) {
        int summe = 0;
        for (int teiler = 1; teiler <= eingabe; teiler++) {
            if ((eingabe % teiler) == 0) {
                summe += teiler;
            }
        }
        return summe;
    }

    public static void main(String[] args) {
        int max = -1;
        int tmp = -1;
        int groessteTeilersumme = -1;
        for (int zaehler = 0; zaehler <= 100; zaehler++) {
            tmp = getTeilerSummen(zaehler);
            if (tmp > max) {
                max = tmp;
                groessteTeilersumme = zaehler;
            }
        }
        System.out.println("Die Zahl mit der größten Teilersumme ist: " + groessteTeilersumme);
    }
}
