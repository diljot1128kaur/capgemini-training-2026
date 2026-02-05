import java.util.*;

public class NestedBlock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            int divisor=sc.nextInt();
            int index=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int val=arr[index];
            System.out.println(val);
            try{
                int res=val/divisor;
                System.out.println(res);
            }
            catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }
        sc.close();
    }
}
