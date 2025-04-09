package Questions.Recursion;
import java.util.*;
public class printnos {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("n =");
        int n=sc.nextInt();
        printn(1,n);
        sc.close();
    }
    public static void printn(int c,int n){
        if(c<=n){
            System.out.print(c+" ");
            printn(c+1,n);
        } 
    }
}
