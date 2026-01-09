import java.util.*;
public class capitalfirst{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String result="";
        for(String w:words){
            if(w.length()>0){
                String capitalized=w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase();
                result+=capitalized+" ";
            }
        }
        System.out.println(result.trim());
        sc.close();
    }
}