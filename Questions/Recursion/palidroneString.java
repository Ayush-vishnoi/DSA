package Questions.Recursion;
import java.util.*;
public class palidroneString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        isPalindrome(str);
    }
    public static void isPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            System.out.println("True");
            return;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            isPalindrome(str.substring(1, str.length()-1));
        }
        else{
            System.out.println("False");
            return;
        }

    }

}
