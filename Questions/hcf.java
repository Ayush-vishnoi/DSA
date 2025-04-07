package Questions;
import java.util.*;
public class hcf {
    public static int gcd(int a,int b){
        int c=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                c=i;
        }
    }
    return c;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
}

}