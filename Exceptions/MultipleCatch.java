import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            int index=sc.nextInt();
            int[] arr=null;

            if(n==0){
                arr[0]=5;
            }
            arr=new int[n];       
            if(n>0){
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
            }
            System.out.println("Value at index "+index +":" +arr[index]);
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        sc.close();
    }
}
