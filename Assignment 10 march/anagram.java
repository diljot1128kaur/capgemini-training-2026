import java.util.*;
public class anagram{
    public static void main(String[] args){
        String str="build";//yes
        String str1="dliub";
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        char[] arr1=str.toCharArray();
        char[] arr2=str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)) System.out.println("yes");
        else{
        System.out.println("no");
        }

    }
}