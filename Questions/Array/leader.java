package Questions.Array;

import java.util.ArrayList;

public class leader{
    public static void main(String[] ags){
        int[] arr = {7,10,4,3,20,15};
        ArrayList <Integer> ans=new ArrayList<>();
        int n= arr.length;
        int max = n-1;
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }   
        }
        System.out.println(ans);
    }


}