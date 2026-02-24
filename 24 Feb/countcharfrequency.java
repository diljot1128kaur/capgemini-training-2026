import java.util.*;
public class countcharfrequency {
    public static void main(String[] args) {
        String str="aaabbbcc";
        StringBuilder result=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(result.toString());

    }
}

