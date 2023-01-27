/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week12
//完成Quicksort跟Heapsort

package HeapSort;

import java.util.Arrays;

/**
 *
 * @author s2000
 */
public class HeapSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
