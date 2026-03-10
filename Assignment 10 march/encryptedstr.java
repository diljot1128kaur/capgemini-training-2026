public class encryptedstr{
    public static void main(String[] args){
        String str="nrfzh";
        //quick;
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='x'){
                result+='a';
            }
            else if(ch=='y'){
                result+='b';
            }
            else if(ch=='z'){
                result+='c';
            }
            else{
                result+=(char)(ch+3);
            }
        }
        System.out.println(result);
    }
}