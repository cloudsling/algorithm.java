
public class Quicksort {

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void sort(Comparable[] a) {
        sort(a, 0, a.length);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo > hi)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j);
        sort(a, j, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi;
        Comparable v = a[lo];
        while (true) {
            while (less(v, a[++i]))
                if (i == hi)
                    break;
            while (less(a[--j], v))
                if (j == lo)
                    break;
            if (i >= j)
                break;
            exch(a, i, j);
        }
        exch(a, i, lo);
        return j;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
       
        sort(args);
        show(args);
    }
}