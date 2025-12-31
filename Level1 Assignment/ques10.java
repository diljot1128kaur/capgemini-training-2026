//Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.*;
public class ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cm=sc.nextInt();
        double feet=cm*0.0328084;
        double inches=cm*0.393701;
        //System.out.println("The height " + cm + " cm in feet is " + feet);
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
        sc.close();
    }
}
