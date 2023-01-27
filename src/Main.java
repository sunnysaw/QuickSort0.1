/*
Question : Given an unsorted array, you have to sort it by using quick sort.
 */

public class Main {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void Quicksort(int[] arr, int low, int high){ // In this block of code we are using recursion.
        if(low < high){
            int pi = partition(arr, low,high);
            Quicksort(arr, low, pi - 1);
            Quicksort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        Quicksort(arr, 0, n - 1);
        System.out.println("NOW PRINTING THE FINAL RESULT :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}