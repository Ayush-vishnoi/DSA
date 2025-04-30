package Questions.Sorting;
import java.util.*;
public class recursiveInsertion {
    public static void main(String[] args){
        int[] arr={7,3,9,4,5,6,0};
        insertionsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionsort(int arr[],int n){
        if(n<=1) return;

        insertionsort(arr,n-1);
        insert(arr,n-1);
    }
    public static void insert(int[] arr,int n){
        if(n==0 || arr[n-1]<=arr[n]) return;

        int temp=arr[n-1];
        arr[n-1]=arr[n];
        arr[n]=temp;

        insert(arr,n-1);
    }
}
