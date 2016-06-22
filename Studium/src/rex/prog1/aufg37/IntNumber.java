package rex.prog1.aufg37;

public class IntNumber extends Number {

    public int value;

    public IntNumber(int input) {
        value = input;
    }

    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value += ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Fuck you");
        }
    }

    @Override
    public void sub(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value -= ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void mul(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value *= ((IntNumber) n).value;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof IntNumber) {
            value /= ((IntNumber) n).value; // ???
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
    public int compareTo(Object arg0) throws IllegalArgumentException {
        if (arg0 instanceof IntNumber) {
            return (value - ((IntNumber) arg0).value);
        }
        throw new IllegalArgumentException("Error");
    }

    @Override
    public IntNumber clone() {
        return new IntNumber(value);
    }

    public String toString() {
        return "" + value;
    }
}
