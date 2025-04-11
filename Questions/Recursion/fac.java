package Questions.Recursion;
import java.util.*;
public class fac {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("N =");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
}
}