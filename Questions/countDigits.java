package Questions;
import java.util.*;
public class countDigits {
    public static int countDigit(int n) {
        int count = 0;
        int num = n;
        int digit;
        while (n > 0) {
            digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
    }
}
