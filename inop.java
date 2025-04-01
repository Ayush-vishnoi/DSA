import java.util.*;
public class inop {
    public static void main(String[] args){
            System.out.print("hello 1");       //System.out.print () is used to print the string
            System.out.print("hello 2");       //System.out.println() is used to print the string and also print a new line
            System.out.println("hello 3");     //System.out.print("/n") is used to print a new line
            System.out.print("hello 4\n");
            System.out.print("hello 5");
           
            Scanner sc =new Scanner(System.in); 
            
            //sc.nextInt() fot integer
            //sc.next() for single srring 
            //sc.nextLine() for multiple string
            //sc.nextFloat() for float
            
            System.out.print("enter your name:");
            String name = sc.nextLine();
            System.out.println(name);

    }
}
