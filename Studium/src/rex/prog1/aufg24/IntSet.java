package rex.prog1.aufg24;

/**
 * 
 * Ein Objekt der Klasse IntSet representiert eine Menge.
 * 
 * @author Rene Kudlek 4719142 Gruppe 4a
 * @author Hauke Kunze 4731735 Gruppe 4a
 *
 */
public class IntSet {

    protected int[] set;

    // **************************** Hilfsmethoden ****************************
    /**
     * Hilfsmethode zum Checken, ob eine Zahl bereits in einem Array vorhanden
     * ist
     * 
     * @param a Array
     * @param b die Zahl
     * @return wahr, wenn die Zahl bereits im Array vorhanden ist
     */
    private boolean arrContains(Integer[] a, Integer b) {
        for (Integer laufInt : a) {
            if (b.equals(laufInt)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Hilfsmethode zum Checken, ob eine Zahl bereits in einem Array vorhanden
     * ist
     * 
     * @param a Array
     * @param b die Zahl
     * @return wahr, wenn die Zahl bereits im Array vorhanden ist
     */
    private boolean arrContains(int[] a, int b) {
        for (int laufInt : a) {
            if (b == laufInt) {
                return true;
            }
        }
        return false;
    }

    /**
     * Hilfsmethode zum Hinzufugen von Zahlen zu einem Array
     * 
     * @param arr das Array
     * @param addi die Zahl die hinzugefugt werden soll
     * @return das Array mit der Zahl
     */
    private Integer[] addToArr(Integer[] arr, int addi) {
        Integer[] result = new Integer[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[arr.length] = addi;
        return result;
    }

    /**
     * Hilfsmethode zum Hinzufugen von Zahlen zu einem Array
     * 
     * @param arr das Array
     * @param addi die Zahl die hinzugefugt werden soll
     * @return das Array mit der Zahl
     */

    private int[] addToArr(int[] arr, int addi) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[arr.length] = addi;
        return result;
    }

    /**
     * 
     * @return gibt das Array zurück
     */

    public int[] getArray() {
        return set;
    }

    // **************************** Klassenmethoden ****************************
    /**
     * Der Konstruktor
     * 
     * @param a UEbergebene Zahlen fur die Menge
     */
    public IntSet(int... a) {
        Integer[] tmpArr = new Integer[a.length];

        for (int laufInt : a) {
            // Check ob die Zahl grosser 0 und noch nicht vorhanden ist
            if (laufInt > 0 && !(arrContains(tmpArr, laufInt))) {
                tmpArr = addToArr(tmpArr, laufInt);
            }
        }

        int count = 0;
        for (Integer i : tmpArr) {
            if (i != null) {
                count++;
            }
        }

        int[] newArray = new int[count];

        int index = 0;
        for (Integer i : tmpArr) {
            if (i != null) {
                newArray[index++] = i;
            }
        }

        set = newArray;
    }

    /**
     * 
     * @return Maximum der Menge
     */
    public int max() {
        int maxWert = 0;
        for (int i : set) {
            if (i > maxWert) {
                maxWert = i;
            }
        }
        return maxWert;
    }

    /**
     * 
     * @return Minimum der Menge
     */

    public int min() {
        int minWert = this.max();
        for (int i : set) {
            if (i < minWert) {
                minWert = i;
            }
        }
        return minWert;
    }

    /**
     * 
     * @return Summe der Menge
     */

    public int sum() {
        int sum = 0;
        for (int i : set) {
            sum += i;
        }
        return sum;
    }

    /**
     * 
     * @return Durchschnitt der Menge
     */

    public int avg() {
        return this.sum() / set.length;
    }

    /**
     * @param set Werte die hinzugefügt werden sollen aus set
     * 
     */

    public void addAll(IntSet set) {
        Integer[] orgArr = new Integer[this.set.length];
        int i = 0;
        for (int b : this.set) {
            orgArr[i++] = b;
        }

        for (int laufInt : set.getArray()) {
            // Check ob die Zahl grosser 0 und noch nicht vorhanden ist
            if (laufInt > 0 && !(arrContains(orgArr, laufInt))) {
                orgArr = addToArr(orgArr, laufInt);
            }
        }

        int count = 0;
        for (Integer a : orgArr) {
            if (a != null) {
                count++;
            }
        }

        int[] newArray = new int[count];

        int index = 0;
        for (Integer a : orgArr) {
            if (a != null) {
                newArray[index++] = a;
            }
        }

        this.set = newArray;
    }

    /**
     * @param set Array das mit dem alten Array auf gleiche Variablen
     *            ueberprueft wird
     * 
     */

    public void retainAll(IntSet set) {
        int[] orgSet = this.set;
        int[] newSet = set.getArray();
        int[] schnittmengeSet = new int[0];

        for (int i : orgSet) {
            for (int o : newSet) {
                if (i == o) {
                    schnittmengeSet = addToArr(schnittmengeSet, i);
                }
            }
        }
        this.set = schnittmengeSet;
    }

    /**
     * @param set Array der alle Elemente aus dem gegebenen Array entfernt
     */

    public void removeAll(IntSet set) {
        int[] orgSet = this.set;
        int[] newSet = set.getArray();
        int[] removeSet = new int[0];

        for (int i : orgSet) {
            if (!arrContains(newSet, i)) {
                removeSet = addToArr(removeSet, i);
            }
        }
        this.set = removeSet;
    }

    /**
     * Kann einen Array in das Consolenfenster schreiben für einen Menschen
     * leserlich
     * 
     */
    public void print() {
        for (int i : set) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
