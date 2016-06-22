package rex.prog1.aufg37;

public class RationalNumber extends Number {

    public double value;

    public RationalNumber(double input) {
        value = input;
    }

    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value += ((RationalNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void sub(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value -= ((RationalNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void mul(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value *= ((RationalNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof RationalNumber) {
            value /= ((RationalNumber) n).value; // ???
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public double abs() {
        if (value < 0) {
            return (value - value - value);
        }
        return value;
    }

    @Override
    public int compareTo(Object o) throws IllegalArgumentException {
        if (o instanceof RationalNumber) {
            return new Double(value - ((RationalNumber) o).value).intValue();
        }
        throw new IllegalArgumentException("Error");
    }
    
    @Override
    public RationalNumber clone() {
        return new RationalNumber(value);
    }
    
    public String toString () {
        return "" + value;
    }
}
