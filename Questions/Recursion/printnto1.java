package Questions.Recursion;

import java.util.Scanner;

public class printnto1 {
     public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("n =");
        int n=sc.nextInt();
        printn(n);
        sc.close();
    }
    public static void printn(int n){
        if(n>0){
            System.out.print(n+" ");
            printn(n-1);
        } 
    }
}

