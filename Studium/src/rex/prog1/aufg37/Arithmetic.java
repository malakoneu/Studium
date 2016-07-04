package rex.prog1.aufg37;

/**
 * The Arithmetic interface for all Arithmetic Numbers
 *
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public interface Arithmetic {
    /**
     * @param n number to add
     */
    public void add(Number n);

    /**
     * @param n number to subtract
     */
    public void sub(Number n);

    /**
     * @param n number to multiply by
     */
    public void mul(Number n);

    /**
     * @param n number to dive
     */
    public void div(Number n);

    /**
     * @return returns the Betrag
     */
    public double abs();
}
