package Questions;

import java.util.Scanner;

public class palidrome {
    public static boolean isPalindrome(int n) {
        int num=n;
        int rev=0;
        int ram;
        while(n>0){
            ram=n%10;
            rev=rev*10+ram;
            n=n/10;
        }
            return num==rev ;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("x = ");
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
    

