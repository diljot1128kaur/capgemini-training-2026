import java.util.*;
public class Ques13 {
    public static int sum(int[] arr, int n){
        int largest=Integer.MIN_VALUE;
        int sLargestEven=Integer.MIN_VALUE;

        for(int i=0;i<n;i+=2){
            if(arr[i]>largest){
                sLargestEven=largest;
                largest=arr[i];
            }
            else if(arr[i]>sLargestEven && arr[i]<largest){
                sLargestEven=arr[i];
            }
        }

        largest=Integer.MIN_VALUE;
        int sLargestOdd=Integer.MIN_VALUE;
        for(int i=1;i<n;i+=2){
           if(arr[i]>largest){
                sLargestOdd=largest;
                largest=arr[i];
            }
            else if(arr[i]>sLargestOdd && arr[i]<largest){
                sLargestOdd=arr[i];
            }
        }
        return sLargestOdd+sLargestEven;
    }
    public static void main(String[] args) {
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
