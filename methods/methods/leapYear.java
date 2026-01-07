
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        boolean is=check(year);
        System.out.println(is);
    }
    public static boolean check(int x){
        if((x%400==0) || (x%4==0 && x%100!=0)){
            return true;
        }
        return false;
    }
}
