import java.util.*;

public class tower_of_hanoi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Poles:");
        int n=sc.nextInt();
        System.out.print("Enter the source:");
        String first=sc.next();
        System.out.print("Enter the Destination:");
        String second=sc.next();
        System.out.print("Enter the Helper:");
        String third=sc.next();
        tower(n,first,second,third);
    }
    public static void tower(int n,String a,String b,String c){
        if(n==1){
            System.out.println("Transition "+n+" from "+a+" to "+b);
            return;
        }
        tower(n-1,a,c,b);
        System.out.println("Transition "+n+" from "+a+" to "+b);
        tower(n-1,c,b,a);
    }
}
