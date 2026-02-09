import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {

        File source = new File("largefile.dat");
        File normalDest = new File("normalCopy.dat");
        File bufferedDest = new File("bufferedCopy.dat");

        byte[] buffer = new byte[4096];
        int bytesRead;

        try {
            // -------- Normal Streams --------
            long startNormal = System.nanoTime();

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(normalDest);

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            long endNormal = System.nanoTime();

            // -------- Buffered Streams --------
            long startBuffered = System.nanoTime();

            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(bufferedDest));

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bis.close();
            bos.close();

            long endBuffered = System.nanoTime();

            System.out.println("Normal Stream Time  : " +
                    (endNormal - startNormal) + " ns");
            System.out.println("Buffered Stream Time: " +
                    (endBuffered - startBuffered) + " ns");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
