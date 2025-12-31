//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
import java.util.*;
public class ques9 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int courseFee=sc.nextInt();
         double discountPercentage=sc.nextInt();
         double discountAmount=(discountPercentage/100)*courseFee;
         double discountedPrice=courseFee-discountAmount;
         System.out.println("The Course Fee is INR " + courseFee);
         System.out.println("The Discount Amount is INR " + discountAmount + " and the Discounted Price is INR " + discountedPrice); 
         sc.close();

    }
}
