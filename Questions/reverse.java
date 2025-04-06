package Questions;

import java.util.Scanner;

public class reverse {
    public static int reversed(int n) {
        int rem;
        int rev=0;
        while(n!=0){
            rem=n%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) 
            return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) 
            return 0;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("x =");
        int x=sc.nextInt();
        System.out.println(reversed(x));
    }
}

