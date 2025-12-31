//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

public class ques6 {
    public static void main(String[] args){
        int courseFee=125000;
        double discountPercentage=10.0;
        double discountAmount=(discountPercentage/100)*courseFee;
        double discountedPrice=courseFee-discountAmount;
        System.out.println("The Course Fee is INR " + courseFee);
        System.out.println("The Discount Amount is INR " + discountAmount + " and the Discounted Price is INR " + discountedPrice); 
    }
}
