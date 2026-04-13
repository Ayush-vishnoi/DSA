package Questions.Sorting;

public class countingInversion {

    // overall complxity is o(nlogn)

    public static int conquer(int arr[],int st,int mid,int ed){

        // time complexity is o(n)

        int merged[]= new int[ed-st+1];
        int c=0;
        int idx1=st;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ed){
            if(arr[idx1]<= arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
                c+=mid-idx1+1;
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
        return c;
        
    }
    public static int divide(int arr[],int st,int ed){

        // time complexity is o(logn)
        int c=0;
        if(st>=ed){
            return c;
        }
        int mid =st+(ed-st)/2; // help in space complexity
        c+=divide(arr,st,mid);
        c+=divide(arr,mid+1,ed);
        c+=conquer(arr,st,mid,ed);
        return c;
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int ed=arr.length;
        int count=divide(arr,0,ed-1);
        for(int i=0;i<ed;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        System.out.print(count);
    }
}
