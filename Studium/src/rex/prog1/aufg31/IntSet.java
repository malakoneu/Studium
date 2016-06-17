package rex.prog1.aufg31;

/**
 * A collection that contains no duplicate elements of numbers 1, 2, 3 and so
 * on. More formally, sets contain no pair of elements e1 and e2 such that e1 ==
 * e2. As implied by its name, this class models the mathematical set
 * abstraction.
 *
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 */
public class IntSet {
    private int[] set;

    /**
     * create a set of numbers
     * @param a elements
     */
    IntSet(int... a) {
        set = makeSet(a);
    }

    /**
     * helper function for set creation
     * @param a a properly set
     * @return returns a real set
     */
    protected int[] makeSet(int[] a) {
        int[] setWithoutDoubles = new int[a.length];
        int counter = 0;
        next: for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    continue next;
                }
            }
            setWithoutDoubles[counter] = a[i];
            counter++;
        }

        int[] set = new int[counter];
        System.arraycopy(setWithoutDoubles, 0, set, 0, set.length);
        return set;
    }

    /**
     * adds all elems from the given set to the set
     * @param a source set
     */
    public void addAll(IntSet a) {
        int[] union = new int[set.length + a.set.length];
        System.arraycopy(set, 0, union, 0, set.length);
        System.arraycopy(a.set, 0, union, set.length, a.set.length);
        set = makeSet(union);
    }

    /**
     * remove all elements from the set witch are not in the given set
     * @param a source set
     */
    public void retainAll(IntSet a) {
        int[] intersection = new int[set.length];
        int counter = 0;
        for (int aSet : set) {
            for (int j = 0; j < a.set.length; j++) {
                if (aSet == a.set[j]) {
                    intersection[counter] = aSet;
                    counter++;
                }
            }
        }
        set = makeSet(intersection);
    }

    /**
     * remove all elements from the set witch are in the given set
     * @param a source set
     */
    public void removeAll(IntSet a) {
        int[] setMinus = new int[set.length];
        int counter = 0;
        next: for (int aSet : set) {
            for (int j = 0; j < a.set.length; j++) {
                if (aSet == a.set[j]) {
                    continue next;
                }
            }
            setMinus[counter] = aSet;
            counter++;
        }
        set = makeSet(setMinus);
    }

    /**
     * sum of the set
     * @return the sum of the set
     */
    public int sum() {
        int sum = 0;
        for (int aSet : set) {
            sum += aSet;
        }
        return sum;
    }

    /**
     * avg of the set
     * @return the avg of the set
     */
    public int avg() {
        if (set.length == 0) {
            return 0;
        }
        return sum() / set.length;
    }

    /**
     * min element of the set
     * @return the min element of the set
     */
    public int min() {
        if (set.length == 0) {
            return 0;
        }
        int min = set[0];
        for (int aSet : set) {
            if (aSet < min) {
                min = aSet;
            }
        }
        return min;
    }

    /**
     * max element of the set
     * @return the max element of the set
     */
    public int max() {
        if (set.length == 0) {
            return 0;
        }
        int max = set[0];
        for (int aSet : set) {
            if (max < aSet) {
                max = aSet;
            }
        }
        return max;
    }

    /**
     * prints all elements from the set
     */
    public void print() {
        for (int aSet : set) {
            System.out.print(aSet + " ");
        }
        System.out.println();
    }

    // ------------------------ Aufg 31 ----------------------//
    /**
     * The method creates s String showing the Elements of the set.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String output = "Die Menge hat die Elemente: ";
        for (int aSet : set) {
            output += (aSet + " ");
        }
        return output;
    }

    /**
     * This method checks whether the set contains the integer i.
     * 
     * @param i Integer to check.
     * @return true if the set contains i.
     */
    public boolean isIn(int i) {
        for (int laufInt : set) {
            if (laufInt == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether s is a Sub-set of this object.
     * 
     * @param s The set s.
     * @return true if the set s is a sub-set of this Object.
     */
    public boolean isSubSet(IntSet s) {
        for (int laufInt : s.set) {
            if (!this.isIn(laufInt)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compares two IntSets.
     * 
     * @return true if the IntSets contain the same integers.
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof IntSet) {
            if (((IntSet) o).isSubSet(this) && this.isSubSet((IntSet) o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * main method
     * @param args unused
     */
    public static void main(String[] args) {
        IntSet set1 = new IntSet(1, 2, 2, 4, -1, -42, 0, 3, 54, 234, 5654, 12, 3, 6, 3);
        set1.print();
        IntSet set2 = new IntSet(2, 2, 4, 5, 7, 1, 3);
        set2.print();
        set1.addAll(set2);
        set1.print();
        set1.removeAll(set2);
        set1.print();
        set1.addAll(set2);
        set1.print();
        set1.retainAll(set2);
        set1.print();

        System.out.println("set1.min() = " + set1.min());
        System.out.println("set1.max() = " + set1.max());
        System.out.println("set1.avg() = " + set1.avg());
        System.out.println("set1.sum() = " + set1.sum());
    }
}
