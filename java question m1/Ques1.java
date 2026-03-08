import java.util.*;
class Ques1{
    public static int numberOfHouses(int[] arr, int n,int val){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=val) return i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        if(n==0){
            System.out.println(-1);
            sc.close();
            return;
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=r*unit;
        System.out.println(numberOfHouses(arr, n, val));
        sc.close();
    }
}