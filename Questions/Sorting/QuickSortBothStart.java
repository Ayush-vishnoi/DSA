package Questions.Sorting;
// import java.util.*;
// public class quick {
//     public static int partition(int arr[],int low,int high){
//         int pivot=arr[high];
//         int i=low-1;

//         for(int j=low;j<high;j++){
//             if(arr[j]<pivot){
//                 i++;
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//         i++;
//         int temp=arr[i];
//         arr[i]=arr[high];
//         arr[high]=temp;
//         return i;
//     }

//     public static void quickSort(int arr[],int low,int high){
//         if(low<high){
//         int pivotIdx=partition(arr,low,high);
//         quickSort(arr,low,pivotIdx-1);
//         quickSort(arr,pivotIdx+1,high);
//         }
//     }
//     public static void main(String[] args){
//         int[] arr={2,8,5,6,3,5,6};
//         int high=arr.length;
//         quickSort(arr,0,high-1);
//         System.out.println(Arrays.toString(arr));
//     }
// }

import java.util.*;

public class QuickSortBothStart {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  
        int i = low;           

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr, low, i);

        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 7, 0, 10, 2};

        System.out.println("Original:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted:");
        printArray(arr);
    }
}