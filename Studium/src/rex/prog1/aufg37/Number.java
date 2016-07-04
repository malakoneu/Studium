package rex.prog1.aufg37;

/**
 * Number abstract class for all Numbers
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public abstract class Number implements Arithmetic, Comparable, Cloneable {

    /**
     * @param numbers numbers to compare
     * @return returns the smallest number
     */
    public static Number min(Number... numbers) {
        Number minimum = numbers[0];
        for (Number i : numbers) {
            if (i.compareTo(minimum) < 0) {
                minimum = i;
            }
        }
        return minimum;
    }

    /**
     * @param numbers numbers to compare
     * @return returns the biggest number
     */
    public static Number max(Number... numbers) {
        Number maximum = numbers[0];
        for (Number i : numbers) {
            if (i.compareTo(maximum) > 0) {
                maximum = i;
            }
        }
        return maximum;
    }

    // ???
    /**
     * @param numbers numbers to add
     * @return returns the sum of the given numbers
     */
    public static Number sum(Number... numbers) {
        Number summe = numbers[0];
        for (Number i : numbers) {
            summe.add(i);
        }
        return summe;
    }

    /**
     * @param numbers numbers to multiply
     * @return returns the product of the numbers
     */
    public static Number prod(Number... numbers) {
        Number produkt = numbers[0];
        for (Number i : numbers) {
            produkt.mul(i);
        }
        return produkt;
    }

    /**
     * @param n number to compare
     * @return returns the euclidian distance
     */
    public double euclidianDistance(Number n) {
        return this.abs() - n.abs();
    }
}