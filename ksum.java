import java.util.*;
public class ksum {
    public static void main(String args[] ){
        int[] nums={1,2,3,42,42,4,2};
        List<List<Integer>>ans=ksum(nums,0,3,5);
        System.out.print(ans);
    }

public static List<List<Integer>> ksum(int[] nums,int start,int k,long target){
    List<List<Integer>> res=new ArrayList<>();
    if(k==2){
        int l=start;
        int r=nums.length-1;
        while(l<r){
            long sum=(long)nums[l]+nums[r];
            if(sum<target){
                l++;

            }
            else if(sum>target){
                r--;
            }
            else{
                res.add(new ArrayList<>(Arrays.asList(nums[l], nums[r])));
                l++;
                r--;
                while(l<r && nums[l]==nums[l-1]) l++;
                while(l<r && nums[r]==nums[r+1]) r--;
            }
        }
        return res;
    }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            List<List<Integer>> pair=ksum(nums,i+1,k-1,target-nums[i]);
            for(List<Integer> trip:pair){
                trip.add(0,nums[i]);
                res.add(trip);
            }
        }
        return res;
    }
}