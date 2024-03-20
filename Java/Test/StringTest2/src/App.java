import java.util.Arrays;
import java.util.StringJoiner;

public class App {
    public static void main(String[] args) throws Exception {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        String[] carArray = {"hyundai", "mercedes", "bmw"};

        for(String s : carArray){
            sj.add(s.toUpperCase());
        }
        System.out.println(sj.toString());

        String s1 = "    Hellow world       ";
        String s2 = s1.trim();
        System.out.printf("#%s#\n", s1);
        System.out.printf("#%s#\n", s2);

        String s3 = s2.substring(1, 3);
        System.out.println(s3);

        System.out.println(s1.replace('l', 'k'));

        char[] carr = s2.toCharArray();
        System.out.println(Arrays.toString(carr));
    }
}
