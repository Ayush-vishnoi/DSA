package Questions.Sorting;

public class selection {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};
        selectionSort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
    }
}
