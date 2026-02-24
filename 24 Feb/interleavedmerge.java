public class interleavedmerge {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="XYZ";
        StringBuilder result=new StringBuilder();
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            result.append(str1.charAt(i));
            result.append(str2.charAt(j));
            i++;
            j++;
        }
        if(i<str1.length()){
            result.append(str1.substring(i));
            
        }
        if(j<str2.length()){
            result.append(str2.substring(j));
        }
        System.out.println(result.toString());
    }
}

