public class leaderarray {
    public static void main(String[] args){
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--){ 
            if(arr[i]>max){
                max=arr[i];
                System.out.print(max+" ");
            }
            
        }
        
        

    }
}
