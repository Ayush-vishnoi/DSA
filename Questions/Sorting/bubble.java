package Questions.Sorting;

public class bubble {
    public static void main (String[] args){
        int[] ar ={2,4,5,3,2,4,5};
        for(int i=ar.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int k=0;k<ar.length-1;k++){
            System.out.print(ar[k]+" ");
        }

    }
}
