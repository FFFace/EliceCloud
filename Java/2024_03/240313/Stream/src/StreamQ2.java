import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQ2 {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("", "Sunny", "Rail", "Snow", "");

        List<String> result = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
