package Level1_08_01_26;

import java.util.*;

public class IllegalArgumentExceptionString {
    public static void generateException(){
        String s = "Diljot";
        System.out.println(s.substring(5,3));
    }
    public static void handleException(){
        String s = "Diljot";
        try{
            System.out.println(s.substring(5,3));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
