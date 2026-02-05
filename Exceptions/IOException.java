import java.io.*;

public class IOException {
    public static void main(String[] args){
        try{
            BufferedReader reader =new BufferedReader(new FileReader("data.txt"));
            String line;
            while((line=reader.readLine())!=null) System.out.println(line);
            System.out.println("File read successfully");
            reader.close();
        }
        catch(Exception e){
            System.out.println("An IO Exception occured: "+e.getMessage());
        }
    }
}
