package Questions.Array;
import java.util.*;
public class unionArray {
    public static void main(String[] args){
        int[] arr1={3,7,5,6,3,7,8,3};
        int[] arr2={1,5,7,0,4,3};
        Set<Integer> unionset =new HashSet<>();
        for(int num:arr1){
            unionset.add(num);
        }
        for(int num:arr2){
            unionset.add(num);
        }
        System.out.println("Union of arrays :");
        for(int num:unionset){
            System.out.print(num+"  ");
        }

    }
}
