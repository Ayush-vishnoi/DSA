package Questions.Array;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 8, 6, 4};

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {          //optimal approach 
    if (arr[i] > max) {
        sMax = max;
        max = arr[i];
    } else if (arr[i] > sMax && arr[i] != max) {
        sMax = arr[i];
    }
}
System.out.println(Arrays.toString(arr));
System.out.println("Second largest : "+sMax);
}}
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         int sMax=arr[0];
//         for(int i=0;i<arr.length;i++){   //not correct for dublicate element
//             if(arr[i]==max){
//                 continue;
//             }
//             if(arr[i]>sMax){
//                 sMax=arr[i];
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println("Largest element : "+sMax);
//     }
// }
