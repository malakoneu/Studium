package rex.prog1.aufg37;

/**
 * class for rational numbers
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public class RationalNumber extends Number {

    /**
     * value of the rational number
     */
    public double value;

    /**
     * @param input the number to be the value of the rational number
     */
    public RationalNumber(double input) {
        value = input;
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#add(rex.prog1.aufg37.Number)
     */
    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value += ((RationalNumber) n).value;
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
        if (n instanceof RationalNumber) {
            value -= ((RationalNumber) n).value;
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
        if (n instanceof RationalNumber) {
            value *= ((RationalNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#div(rex.prog1.aufg37.Number)
     */
    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value /= ((RationalNumber) n).value; // ???
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
    public int compareTo(Object o) throws IllegalArgumentException {
        if (o instanceof RationalNumber) {
            return new Double(value - ((RationalNumber) o).value).intValue();
        }
        throw new IllegalArgumentException("Error");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public RationalNumber clone() {
        return new RationalNumber(value);
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
