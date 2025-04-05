package Pattern;

public class number {
    public static void main(String[] args) {
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=1;k<=n-i;k++){
            System.out.print("  ");
        }
        for(int l=i;l>0;l--){
            System.out.print(l);
        }
    System.out.println(" ");
}
}
}