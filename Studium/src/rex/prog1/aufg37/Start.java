package rex.prog1.aufg37;

public class Start {

    public Start() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        IntNumber myInt1 = new IntNumber(5);
        IntNumber myInt2 = new IntNumber(2);
        IntNumber myInt3 = new IntNumber(76);
        IntNumber myInt4 = new IntNumber(59);
        IntNumber myInt5 = new IntNumber(3);
        IntNumber myInt6 = new IntNumber(1);

        RationalNumber myRat1 = new RationalNumber(5.5);
        RationalNumber myRat2 = new RationalNumber(2.8);
        RationalNumber myRat3 = new RationalNumber(76.2);
        RationalNumber myRat4 = new RationalNumber(59.5);
        RationalNumber myRat5 = new RationalNumber(3.9);
        RationalNumber myRat6 = new RationalNumber(1.3);

        ComplexNumber myCom1 = new ComplexNumber(5, 5);
        ComplexNumber myCom2 = new ComplexNumber(2, 8);
        ComplexNumber myCom3 = new ComplexNumber(76, 2);

        System.out.println(myInt1.value);

        // myInt4.add(myRat3);
        System.out.println(myInt4.toString());

        myCom1.sub(myCom2);
        System.out.println(myCom1.toString());

        System.out.println(Number.min(myRat1, myRat2, myRat3));

        System.out.println(Number.max(myCom1, myCom2, myCom3));

        System.out.println(Number.prod(myInt1, myInt3, myInt6));

        System.out.println(myInt4.euclidianDistance(myInt2));

    }
}
