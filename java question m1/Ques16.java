import java.util.*;
public class Ques16 {
    public static void maxValue(int[] arr, int n){
        int max=Integer.MIN_VALUE;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max=arr[i];
                j=i;
            }
        }
        System.out.println(max);
        System.out.println(j);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxValue(arr,n);
        sc.close();
    }
}
