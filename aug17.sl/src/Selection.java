import java.util.*;
import java.lang.*;
public class Selection {
    public Selection() {
        super();
        
    }
    public static void sort(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (less(a[j], a[i]))
                    exch(a, i, j);
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Selection.sort(args);

        show(args);
    }
}