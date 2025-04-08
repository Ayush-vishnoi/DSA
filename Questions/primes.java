package Questions;
import java.util.*;
public class primes {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        System.out.println(fprime(n));
        sc.close();
}
public static boolean fprime(int n){
    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
    }
}
return true;
}
}