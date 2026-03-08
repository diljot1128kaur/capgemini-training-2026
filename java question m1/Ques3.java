import java.util.*;
public class Ques3 {
    public static int count(int[] arr, int num, int diff, int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-num)<=diff) cnt++;
        }
        return (cnt!=0?cnt:-1);
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(count(arr,num,diff,n));
        sc.close();
    }
}
