package rex.prog1.aufg37;

public class ComplexNumber extends Number {

    public double reell;
    public double imaginar;

    public ComplexNumber(double r, double i) {
        reell = r;
        imaginar = i;
    }

    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            reell += ((ComplexNumber) n).reell;
            imaginar += ((ComplexNumber) n).imaginar;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void sub(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            reell -= ((ComplexNumber) n).reell;
            imaginar -= ((ComplexNumber) n).imaginar;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    @Override
    public void mul(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            double reell2 = ((ComplexNumber) n).reell;
            double imaginar2 = ((ComplexNumber) n).imaginar;

            reell = reell * reell2 - imaginar * imaginar2;
            imaginar = reell * imaginar2 + reell2 * imaginar;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    // Hilfsmethode fur Modulo
    public double mod() {
        if (reell != 0 || imaginar != 0) {
            return Math.sqrt(reell * reell + imaginar * imaginar);
        } else {
            return 0d;
        }
    }

    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            double den = Math.pow(((ComplexNumber) n).mod(), 2);
            reell = reell * ((ComplexNumber) n).reell + imaginar * ((ComplexNumber) n).imaginar / den;
            imaginar = imaginar * ((ComplexNumber) n).reell - reell * ((ComplexNumber) n).imaginar / den;
        }
        throw new IllegalArgumentException("Error");
    }

    @Override
    public double abs() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(Object o) throws IllegalArgumentException {
        if (o instanceof ComplexNumber) {
            return new Double(abs() - ((ComplexNumber) o).abs()).intValue();
        }
        throw new IllegalArgumentException("Error");
    }

    @Override
    public ComplexNumber clone() {
        return new ComplexNumber(reell, imaginar);
    }

    public String toString() {
        return "" + reell + " " + imaginar;
    }

}
