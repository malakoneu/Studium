package rex.prog1.aufg37;

/**
 * class for integer numbers
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public class IntNumber extends Number {

    /**
     * the value of the integer
     */
    public int value;

    /**
     * @param input the number to be the integers value
     */
    public IntNumber(int input) {
        value = input;
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#add(rex.prog1.aufg37.Number)
     */
    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value += ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#sub(rex.prog1.aufg37.Number)
     */
    @Override
    public void sub(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value -= ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#mul(rex.prog1.aufg37.Number)
     */
    @Override
    public void mul(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value *= ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Fuck you");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#div(rex.prog1.aufg37.Number)
     */
    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value /= ((IntNumber) n).value; // ???
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#abs()
     */
    @Override
    public double abs() {
        if (value < 0) {
            return (value - value - value);
        }
        return value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Object arg0) throws IllegalArgumentException {
        if (arg0 instanceof IntNumber) {
            return (value - ((IntNumber) arg0).value);
        }
        throw new IllegalArgumentException("Error");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public IntNumber clone() {
        return new IntNumber(value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "" + value;
    }
}
