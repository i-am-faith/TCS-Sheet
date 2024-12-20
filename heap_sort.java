import java.util.*; 
import java.io.*; 

public class Solution {
    public static void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        // Left child
        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        // Right child
        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            Collections.swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public static void buildmaxheap(ArrayList<Integer> arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static ArrayList<Integer> heapSort(ArrayList<Integer> arr, int n) {
        buildmaxheap(arr, n);

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(arr, 0, i); 
            heapify(arr, i, 0); 
        }

        return arr;
    }
}
