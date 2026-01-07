
import java.util.Scanner;

public class posAndNeg {
    public static boolean isPos(int x){
        return x>=0;
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
    public static int compare(int a,int b){
        if(a==b){
            return 0;
        }else if(a>b){
            return 1;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scn.nextInt();

            if(isPos(arr[i])){
                System.out.println(isEven(arr[i])?"Positive Even":"Positive Odd");
            }else{
                System.out.println("Negative");
            }
        } 
        
        int res=compare(arr[0],arr[4]);
        System.out.println(res==0?"Equal":(res>0?"Greater":"Less"));
        scn.close();
    }

}
