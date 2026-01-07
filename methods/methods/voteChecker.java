
import java.util.Scanner;

public class voteChecker {
    public static boolean check(int x){
        if(x>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        boolean is =check(age);
        System.out.println(is);
    }
}
