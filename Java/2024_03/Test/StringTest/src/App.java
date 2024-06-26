public class App {
    public static void main(String[] args) throws Exception {
        String s1 = new String("hello");
        String s2 = "hello";

        System.out.printf("%s, %s\n", s1.hashCode(), s2.hashCode());

        String s3 = new String("hello");
        String s4 = "hello";

        System.out.printf("%s, %s\n", s3.hashCode(), s4.hashCode());

        System.out.printf("s1 == s2 : %s\n", s1 == s2);
        System.out.printf("s1 == s3 : %s\n", s1 == s3);
        System.out.printf("s2 == s4 : %s\n", s2 == s4);
        System.out.printf("s1.equals(s2) : %s\n ", s1.equals(s2));
        
        s2 = s2 + " world";
        String s5 = "hello world";

        System.out.printf("s1 == s5 : %s\n", s1 == s5);
    }
}
