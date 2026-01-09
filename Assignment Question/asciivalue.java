import java.util.*;
public class asciivalue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        sc.close();
    }
}