package rex.prog1.aufg26;

public class Geburtstagswahrscheinlichkeit {

    static double getProb(int numPeople) {
        double wSchein = 1.0;
        for (double tage = 365.0; tage >= (365.0 - numPeople + 1.0); tage--) {
            wSchein = wSchein * (tage / 365);
        }
        return (1 - wSchein);
    }

    public static void main(String[] args) {
        for (int zaehler = 2; zaehler <= 60; zaehler++) {
            System.out.println("Wahrscheinlichkeit fuer " + zaehler + ": " + getProb(zaehler));
        }
    }

}
