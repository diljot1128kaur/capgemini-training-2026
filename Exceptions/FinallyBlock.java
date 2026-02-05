import java.util.*;
public class FinallyBlock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("Result: "+num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero");
        }
        finally{
            System.out.println("Operation completed");
        }
        sc.close();
    }
}
