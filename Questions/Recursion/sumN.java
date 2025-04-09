package Questions.Recursion;

import java.util.Scanner;

public class sumN {
     public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("n =");
        int n=sc.nextInt();
        int a=0;
        printn(1,a,n);
        sc.close();
    }
    public static void printn(int c,int a,int n){
        if(c<=n){
            a=a+c;
            printn(c+1,a,n);
        } 
        System.out.println(a);
    }
}

