package Questions.Sorting;

public class insertion {
    public static void main(String[] args){
        int[] ar={2,5,1,3,9,5,7};
        for(int i=0;i<ar.length-1;i++){
            int j=i;
            while(j>0 && ar[j-1]>ar[j] ){
                int temp = ar[j-1];
                ar[j-1]=ar[j];
                ar[j]=temp;
                j--;
            }
        }
        for(int i=0;i<ar.length-1;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
