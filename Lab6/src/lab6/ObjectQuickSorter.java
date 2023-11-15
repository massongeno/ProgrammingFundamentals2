package lab6;

public class ObjectQuickSorter {

    public static void sort(Comparable [] a) {
        if (a == null || a.length == 0) {
            return;
        }
        quickSort(a,0, a.length - 1);
    }

    public static void quickSort(Comparable [] a, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        Comparable pivot = a[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (a[i].compareTo(pivot) < 0) {
                i++;
            }

            while (a[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeObjects(a,i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(a,lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(a,i, higherIndex);
        }
    }

    public static void exchangeObjects(Comparable [] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}