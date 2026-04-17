package Graph;
import java.util.*;
public class usingMatrix {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of node:");
        int n=sc.nextInt();
        System.out.print("Enter no. of edges:");
        int m=sc.nextInt();
        int[][] mat=new int[n][n];
        System.out.println("Enter the direction of edges:");
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            System.out.print("->");
            int v=sc.nextInt();
            mat[u][v]=1;
            //for undirected
            mat[v][u]=1;
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(mat[i][j]==1){
                    System.out.print(i+"->"+j);
                }
            }
        }

    }
}
