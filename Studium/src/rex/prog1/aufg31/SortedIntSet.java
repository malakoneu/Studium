/**
 * 
 */
package rex.prog1.aufg31;

import rex.prog1.aufg31.IntSet;

/**
 * @author DarkTron
 *
 */
public class SortedIntSet extends IntSet {
    /**
     * @param a
     */
    public SortedIntSet(int... a) {
        super(a);
    }

    @Override
    protected int[] makeSet(int[] a) {
        int[] ResultSet = super.makeSet(a);
        ResultSet = bubbleSort(ResultSet);
        return ResultSet;
    }

    protected int[] bubbleSort(int[] unsorted) {
        int stelle;
        boolean change = true;
        int temp;

        do {
            change = false;
            for (stelle = 0; stelle < unsorted.length - 1; stelle++) {
                if (unsorted[stelle] > unsorted[stelle + 1]) {
                    temp = unsorted[stelle];
                    unsorted[stelle] = unsorted[stelle + 1];
                    unsorted[stelle + 1] = temp;
                    change = true;
                }
            }
        } while (change);

        return unsorted;
    }

    public static void main(String[] args) {

        SortedIntSet myIntSet = new SortedIntSet(1, 5, 7, 2, 4);
        SortedIntSet myIntSet2 = new SortedIntSet(8, 53, 13, 5, 8);
        IntSet myIntSet3 = new IntSet(1, 5, 7, 2, 4);
        
        myIntSet.print();
        System.out.println(myIntSet2.toString());
        System.out.println("isIn " + myIntSet3.isIn(5));
        System.out.println("isIn " + myIntSet3.isIn(9999));
        System.out.println("isSubSet " + myIntSet3.isSubSet(new SortedIntSet(1, 5, 7)));
        System.out.println("equals " + myIntSet.equals(myIntSet3));
    }
}
