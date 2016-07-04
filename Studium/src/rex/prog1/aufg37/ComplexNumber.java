package rex.prog1.aufg37;

/**
 * class for complex numbers
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public class ComplexNumber extends Number {

    /**
     * the real part of the complex number
     */
    public double reell;
    /**
     * the imaginary part of the number
     */
    public double imaginar;

    /**
     * @param r value to be the real part of the number
     * @param i value to be the imaginary part of the number
     */
    public ComplexNumber(double r, double i) {
        reell = r;
        imaginar = i;
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#add(rex.prog1.aufg37.Number)
     */
    @Override
    public void add(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            reell += ((ComplexNumber) n).reell;
            imaginar += ((ComplexNumber) n).imaginar;
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
        if (n instanceof ComplexNumber) {
            reell -= ((ComplexNumber) n).reell;
            imaginar -= ((ComplexNumber) n).imaginar;
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
    /**
     * @return returns the modulo value of the complex number
     */
    public double mod() {
        if (reell != 0 || imaginar != 0) {
            return Math.sqrt(reell * reell + imaginar * imaginar);
        } else {
            return 0d;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#div(rex.prog1.aufg37.Number)
     */
    @Override
    public void div(Number n) throws IllegalArgumentException {
        if (n instanceof ComplexNumber) {
            double den = Math.pow(((ComplexNumber) n).mod(), 2);
            reell = reell * ((ComplexNumber) n).reell + imaginar * ((ComplexNumber) n).imaginar / den;
            imaginar = imaginar * ((ComplexNumber) n).reell - reell * ((ComplexNumber) n).imaginar / den;
        }
        throw new IllegalArgumentException("Error");
    }

    /*
     * (non-Javadoc)
     * 
     * @see rex.prog1.aufg37.Arithmetic#abs()
     */
    @Override
    public double abs() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Object o) throws IllegalArgumentException {
        if (o instanceof ComplexNumber) {
            return new Double(abs() - ((ComplexNumber) o).abs()).intValue();
        }
        throw new IllegalArgumentException("Error");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public ComplexNumber clone() {
        return new ComplexNumber(reell, imaginar);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "" + reell + " " + imaginar;
    }

}
