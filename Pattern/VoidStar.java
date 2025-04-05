package Pattern;

public class VoidStar {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
        }
        for(int k=1;k<=2*i;k++){
            System.out.print(" ");
        }
        for(int l=0;l<n-i;l++){
            System.out.print("*");
    }
        System.out.println(" ");
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
        }
        for(int k=1;k<=2*(n-i)-2;k++){
            System.out.print(" ");
        }
        for(int l=0;l<=i;l++){
            System.out.print("*");
    }
        System.out.println(" ");
        }
}
}