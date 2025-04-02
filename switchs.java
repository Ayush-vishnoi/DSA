import java.util.*;
public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 4:");
        int n = sc.nextInt();
        switch (n){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("no match");
        }
    }


}