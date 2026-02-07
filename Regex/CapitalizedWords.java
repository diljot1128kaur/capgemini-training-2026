import java.util.*;
public class CapitalizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            word = word.replace(".", "").replace(",", "");
            if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
                System.out.print(word + " ");
            }
        }

        sc.close();
    }
}
