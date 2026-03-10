import java.util.*;
public class maxfreq{
    public static void main(String[] args){
        String str="abcdd";//d
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        char result=' ';
        int max=0;
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue()>max){
                 max=e.getValue();
                 result=e.getKey();
            }
        }
        System.out.println(result);

       
    }
}