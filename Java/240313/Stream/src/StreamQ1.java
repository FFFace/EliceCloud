import java.util.List;
import java.util.stream.Collectors;

public class StreamQ1 {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "elice", "racer");
        List<String> result = strings.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}