package Questions.Recursion;
import java.util.*;
public class palidroneString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s= sc.nextLine();
        String str =s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(isPalindrome(str));
        sc.close();
    }
    public static boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        else{
            return false;
        }

    }

}
