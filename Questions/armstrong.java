package Questions;

public class armstrong {
    public static void arms(int n){
        int num=n;
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        int a=num;
        int r;
        int sum=0;
        while(num>0){
            r=num%10;
            sum=sum+(int)Math.pow(r,c);
            num=num/10;
        }
        if(sum==a){
            System.out.println(a+" is an armstrong number");
    }
    else{
        System.out.println(a+" is not an armstrong number");
    }
}
public static void main(String[] args) {
    arms(153);
}}