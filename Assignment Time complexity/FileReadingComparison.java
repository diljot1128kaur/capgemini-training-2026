import java.io.*;

class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        long start, end;

        FileReader fr = new FileReader("data.txt");
        start = System.nanoTime();
        while (fr.read() != -1) {}
        end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start));
        fr.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("data.txt"));
        start = System.nanoTime();
        while (isr.read() != -1) {}
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start));
        isr.close();
    }
}
