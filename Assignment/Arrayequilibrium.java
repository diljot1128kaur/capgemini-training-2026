public class Arrayequilibrium{
    public static void main(String[] args){
        int[] arr={1,2,4,2,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(leftsum==sum){
                System.out.println(i);
                break;
            }
            leftsum+=arr[i];
        }
        
    }

}
