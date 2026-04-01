public class array {
    public static void main(String args[]){
        int[] arr={2,1,4,3,5};
        int n=5;
        int c=1;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=c*Math.pow(10,arr[i]-1);
            c++;
        }

        System.out.print(sum);
    }
}
