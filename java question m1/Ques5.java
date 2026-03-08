
import java.util.*;
public class Ques5 {
    public static int sum(int[] arr,int n){
        if(n==0 || n<=3) return 0;
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i+=2){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>sLargest && arr[i]<largest){
                sLargest=arr[i];
            }
        }

        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;
         for(int i=1;i<n;i+=2){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<sSmallest && arr[i]>smallest){
                sSmallest=arr[i];
            }
        }
        return sLargest+sSmallest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,n));
        sc.close();
    }
}


