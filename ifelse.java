import java.util.*;
public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value:");
        int n = sc.nextInt();
        if (n>100){
            System.out.println("large number");   //if else can be used in three type 1. if-else 2. nested if-elseif-else 3.nested if if-else
        }
        else if(n<100){
            System.out.println("small number");
        }
        else{
            System.out.println("equal to 100");
        }
    }
}
