public class countupperandlower{
    public static void main(String[] args){
        String str="My Name is diljot Kaur";
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
            else{
                lower++;
            }
        }
        if(upper>lower){
            str=str.toUpperCase();
            System.out.println(str);
        }
        else{
            str=str.toLowerCase();
            System.out.println(str);
        }
    }
}