import java.util.*;

public class Custom {
    public static void validateAge(int age){
        try{
            if(age>=18) System.out.println("Access granted");
            else{
                throw new Exception("Age must be 18 or above");
            }
        }
        catch(Exception  e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        validateAge(age);
        sc.close();
    }
}
