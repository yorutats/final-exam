/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week12
//完成Quicksort跟Heapsort

package QuickSort;

/**
 *
 * @author s2000
 */
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 4, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
