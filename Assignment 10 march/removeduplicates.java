import java.util.*;
public class removeduplicates{
    public static void main(String[] args){
        String str="CshapstarZ";
        StringBuilder result=new StringBuilder();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){
                result.append(ch);
                set.add(ch);
            }
        }
        System.out.println(result.toString());
    }
}