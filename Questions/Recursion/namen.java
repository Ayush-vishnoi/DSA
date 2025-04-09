package Questions.Recursion;
import java.util.*;
public class namen {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Enter how many times you want to repeat the string:");
        int n=sc.nextInt();
        inputn(1,n,s);
    }
    public static void inputn(int c,int n, String s){
        if(c<=n){
            System.out.println(s);
            inputn(c+1,n,s);

    }
}
}
