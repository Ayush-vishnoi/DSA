package Pattern;

public class alpha3 {
    public static void main(String[] args){
        int n=5;
        char ch=(char)('A'+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ch--;
            }
            
            for(int k=1;k<=i;k++){
               System.out.print(ch+" ");
                    ch++;
    }
    System.out.println(" ");
}
}
}