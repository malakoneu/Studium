package rex.prog1.aufg24;

/**
 * Die Klasse testet die Klasse IntSet
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 *
 */
public class Start {

    /**
     * Die main
     * @param args nicht verwendet
     */
    public static void main(String[] args) {

        System.out.println("Initialisiere");
        IntSet mySet1 = new IntSet(-1, 0, 0, 1, 2, 3, 3, 4, 5, 6);
        IntSet mySet2 = new IntSet(4, 5, 6, 7, 8, 9);
        IntSet mySet3 = new IntSet(4, 5, 6, 10);

        System.out.println();
        System.out.println("Startwerte");
        System.out.print("Set 1: ");
        mySet1.print();
        System.out.print("Set 2: ");
        mySet2.print();
        System.out.print("Set 3: ");
        mySet3.print();

        System.out.println();
        System.out.println("Maxima:");
        System.out.println("Set 1: " + mySet1.max());
        System.out.println("Set 2: " + mySet2.max());

        System.out.println();
        System.out.println("Minima:");
        System.out.println("Set 1: " + mySet1.min());
        System.out.println("Set 2: " + mySet2.min());

        System.out.println();
        System.out.println("Summen:");
        System.out.println("Set 1: " + mySet1.sum());
        System.out.println("Set 2: " + mySet2.sum());

        System.out.println();
        System.out.println("Avg:");
        System.out.println("Set 1: " + mySet1.avg());
        System.out.println("Set 2: " + mySet2.avg());

        System.out.println();
        System.out.println("Vereinigung 1 und 2");
        mySet1.addAll(mySet2);
        mySet1.print();

        System.out.println();
        System.out.println("Schnittmenge 1 und 3");
        mySet1.retainAll(mySet3);
        mySet1.print();

        System.out.println();
        System.out.println("2 ohne 3");
        mySet2.removeAll(mySet3);
        mySet2.print();
    }

}
