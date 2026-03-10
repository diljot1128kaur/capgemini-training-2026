public class missingele{
    public static void main(String[] args){
        int[] arr={1,2,3,5,6};//4
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(i+1)-arr[i];
        }
        sum+=n+1;
        System.out.println(sum);
    }
}