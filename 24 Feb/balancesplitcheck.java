public class balancesplitcheck {
    public static void main(String[] args){
       int[] arr={1,2,3,4,10};
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       int leftsum=0;
       for(int i=0;i<arr.length;i++){
          leftsum+=arr[i];
          if(leftsum==sum-leftsum){
            System.out.println("Yes");
          }
       }
    
        


    }
}
