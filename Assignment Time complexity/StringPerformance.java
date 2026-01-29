import java.util.*;

class StringPerformance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long start, end;

        String s = "";
        start = System.nanoTime();
        for (int i = 0; i < n; i++)
            s += "a";
        end = System.nanoTime();
        System.out.println("String Time: " + (end - start));

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++)
            sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        StringBuffer sf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++)
            sf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
        sc.close();
    }
}
