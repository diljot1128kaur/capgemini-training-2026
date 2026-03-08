public class replacechar{
    public static void main(String[] args){
        String str="apples";
        char ch='a';
        char ch1='p';
        String result=" ";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==ch){
                result+=ch1;
            }
            else if(c==ch1){
                result+=ch;
            }
            else{
                result+=c;
            }
        }
        System.out.println(result);
    }
}