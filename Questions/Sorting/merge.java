package Questions.Sorting;

public class merge {
    public static void conquer(int arr[],int st,int mid,int ed){
        int merged[]= new int[ed-st+1];

        int idx1=st;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ed){
            if(arr[idx1]<= arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ed){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=st;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
        
    }
    public static void divide(int arr[],int st,int ed){
        if(st>=ed){
            return;
        }
        int mid =st+(ed-st)/2; // help in space complexity
        divide(arr,st,mid);
        divide(arr,mid+1,ed);
        conquer(arr,st,mid,ed);
    }
    public static void main(String[] args){
        int arr[]={2,3,4,9,5,9,2,8,3};
        int ed=arr.length;
        divide(arr,0,ed-1);
        for(int i=0;i<ed;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
