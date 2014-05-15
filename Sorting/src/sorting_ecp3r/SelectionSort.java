package sorting_ecp3r;

public class SelectionSort {

public static void selectionSort1(int[] x) {
    for (int i=0; i<x.length-1; i++) {
        for (int j=i+1; j<x.length; j++) {
            if (x[i] > x[j]) {
                //... Exchange elements
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
    }
 }
public static void selectionSort2(int[] x) {
    for (int i=0; i<x.length-1; i++) {
        int minIndex = i;      // Index of smallest remaining value.
        for (int j=i+1; j<x.length; j++) {
            if (x[minIndex] > x[j]) {
                minIndex = j;  // Remember index of new minimum
            }
        }
        if (minIndex != i) { 
            //...  Exchange current element with smallest remaining.
            int temp = x[i];
            x[i] = x[minIndex];
            x[minIndex] = temp;
        }
    }
  }
}
