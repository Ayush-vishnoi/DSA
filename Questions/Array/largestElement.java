package Questions.Array;
import java.util.*;
public class largestElement {
    public static void main(String[] args){
        int[] arr={3,5,7,9,8,6,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest element : "+max);
    }
}
