package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class usingAdjacency {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] arr=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=new ArrayList<>();
        }
        // 0->{}
        // 1->{}
        // 2->{}
        // ...
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            arr[u].add(v);
        }
        sc.close();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " -> ");
            for(int node : arr[i]){
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
