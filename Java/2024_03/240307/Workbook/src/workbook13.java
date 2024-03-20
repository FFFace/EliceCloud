import java.util.Scanner;

public class workbook13 {
    public static int f(int n) {
        String str = String.valueOf(n);
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while(num >= 10){
            num = f(num);
        }
        System.out.println(num);
    }
}
