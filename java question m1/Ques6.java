import java.util.*;
public class Ques6 {
    public static int productSmallestPair(int[] arr,int n, int sum){
        if(n==0 || n<2) return -1;
        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;
         for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<sSmallest && arr[i]>smallest){
                sSmallest=arr[i];
            }
        }
        if(sSmallest+smallest<=sum) return sSmallest*smallest;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(productSmallestPair(arr,n,sum));
        sc.close();
    }
}
