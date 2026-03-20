import java.util.*;
public class functions {
    public static void main(String[] args){
        int[] arr={3,1,2};
        System.out.println("Given array:"+Arrays.toString(arr));
        subsequence(arr,0,new ArrayList<>());
    }
    public static void subsequence(int[] arr,int idx,List<Integer> result ){
        if(idx==arr.length){
            System.out.println(result+" ");
            return;
        }
        result.add(arr[idx]);
        subsequence(arr,idx+1,result);
        result.remove(result.size()-1);
        subsequence(arr,idx+1,result);
    }
}
