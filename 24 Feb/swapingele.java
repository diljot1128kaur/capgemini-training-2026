public class swapingele{
    public static void swapelement(int[] arr){
        int n=arr.length;
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            i+=2;
            j+=2;
        }
        
    }
    public static void main(String[] args){
        int[] arr={5,2,9,1,6};
        int n=arr.length;
        swapelement(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}