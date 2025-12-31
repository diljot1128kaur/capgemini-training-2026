//Create a program to convert distance in kilometers to miles.
import java.util.*;
public class ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int km=sc.nextInt();
        double miles=km*0.621371;
        System.out.println("The distance " + km + " km in miles is " + miles);
        sc.close();
        

    }
}
