import java.util.HashSet;

public class firstrepeatedstr {
    public static void main(String[] args) {
       String[] str={"java","python","java","c++","python"};
       HashSet<String> set=new HashSet<>();
        String repeat=" ";
        for(String s : str){
            if(set.contains(s)){
                repeat=s;
                break;
            }
            set.add(s);
        }
        System.out.println(repeat);
    }
            
}
    
       
