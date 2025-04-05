package Pattern;

public class BinaryPattern {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(b);
                }
                else{
                    System.out.print(a);
                }
            }
            System.out.println(" ");
    }
}
}