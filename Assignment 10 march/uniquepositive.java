public class uniquepositive{
    public static void main(String[] args){
        int[] arr={1,-2,3,-4,5,6};
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>0 && arr[i-1]<0 && arr[i+1]<0){
                System.out.println(arr[i]);
            }
        }

    }
}