package Pattern;

public class Diamond {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        
            System.out.println("\n");
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
        
            System.out.println("\n");
        }
    }
}
