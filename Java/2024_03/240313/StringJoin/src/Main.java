import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("elice");
        words.add("racer");
        words.add("is");
        words.add("awesome");

        String str = String.join(" ", words);
        System.out.println(str);
    }
}