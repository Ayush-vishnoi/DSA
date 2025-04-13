package Questions.Hashing;
import java.util.*;
public class FindFrequency{
    public static void main(String[] args){
        System.out.print("Enter the length of array:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter how many times you want to find the frequency of the element:");
        int b=sc.nextInt();
        for(int j=0;j<b;j++){
            int a=sc.nextInt();
            frequency(arr,a);
        }
        sc.close();
        
    }
    public static void frequency(int[] arr,int a){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
            
        }
        System.out.println(count);

    }
}
