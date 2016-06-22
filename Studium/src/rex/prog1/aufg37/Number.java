package rex.prog1.aufg37;

public abstract class Number implements Arithmetic, Comparable, Cloneable {

    public static Number min(Number... numbers) {
        Number minimum = numbers[0];
        for (Number i : numbers) {
            if (i.compareTo(minimum) < 0) {
                minimum = i;
            }
        }
        return minimum;
    }

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
    public static Number sum(Number... numbers) {
        Number summe = numbers[0];
        for (Number i : numbers) {
            summe.add(i);
        }
        return summe;
    }

    public static Number prod(Number... numbers) {
        Number produkt = numbers[0];
        for (Number i : numbers) {
            produkt.mul(i);
        }
        return produkt;
    }

    public double euclidianDistance(Number n) {
        return this.abs() - n.abs();
    }
}