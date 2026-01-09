public class removevowel{
    public static void main(String[] args){
        String str="Hello World";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
               ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}