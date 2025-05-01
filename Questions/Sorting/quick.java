package Questions.Sorting;
import java.util.*;
public class quick {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
        int pivotIdx=partition(arr,low,high);
        quickSort(arr,low,pivotIdx-1);
        quickSort(arr,pivotIdx+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={2,8,5,6,3,5,6};
        int high=arr.length;
        quickSort(arr,0,high-1);
        System.out.println(Arrays.toString(arr));
    }
}
