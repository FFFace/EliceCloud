public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "hello world";

        System.out.println(s1);
        System.out.printf("indexOf('l') : %s\n", s1.indexOf('l'));
        System.out.printf("lastIndexOf('l') : %s\n", s1.lastIndexOf('l'));
        System.out.printf("charAt(6) : %s\n", s1.charAt(6));
        System.out.printf("startWith(\"he\") : %s\n", s1.startsWith("he"));
        System.out.printf("length : %s\n", s1.length());
    }
}
