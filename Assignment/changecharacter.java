public class changecharacter{
    public static void main(String[] args){
        String str="aabbbcccaa";
        String result=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'){
                result+='b';
            }
            else if(ch=='b'){
                result+='a';
            }
            else{
                result+=ch;
            }

        }
        System.out.println(result); 
    }
}