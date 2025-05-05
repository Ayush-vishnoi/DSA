package Questions.Array;
import java.util.*;
public class linearSearch {
    public static void main(String[] args){
        int[] nums={5,79,3,4,6,8,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be search:");
        int data=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==data){
                System.out.println("Data found at loc:"+ i);
                break;
            }
            if(i==nums.length-1){
                System.out.println("Data not found");
            }
        }
    }
}
