import java.util.*;
public class replacehypen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace(" ", "_");
        System.out.println(str);
    }
}