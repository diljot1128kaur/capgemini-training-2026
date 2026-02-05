import java.util.*;
public class Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("Result: "+num1/num2);
        }
        catch(InputMismatchException e){
            System.out.println("Non-numeric input");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }
        
        sc.close();

    }
}
