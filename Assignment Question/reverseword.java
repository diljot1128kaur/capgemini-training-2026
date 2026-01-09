import java.util.*;
public class reverseword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String reversed="";
        for(String w:words){
            String result="";
            for(int i=w.length()-1;i>=0;i--){
                result+=w.charAt(i);
            }
            reversed+=result+"";
        }
        System.out.println(reversed.trim());
        sc.close();
        
    }
}