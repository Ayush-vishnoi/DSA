package Questions;
import java.util.*;
public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input:");
        int n = sc.nextInt();
        System.out.println(sumofdivisor(n));
        sc.close();
    }
    public static int sumofdivisor(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+divisors(i);
        }
        return sum;
}
public static int divisors(int a) {
    int s=0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            s=s+i;
        }
}
return s;
}
}