import java.util.*;

public class RepeatedWords {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] arr=s.split(" ");
    HashMap<String,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    }
    for(String str:map.keySet()){
        if(map.get(str)>1) System.out.println(str);
    }
    sc.close();
    }
}
