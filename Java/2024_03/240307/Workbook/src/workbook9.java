public class workbook9 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String args[]) {
        int num1 = 8;
        int num2 = 2;

        System.out.println("8 + 2 = " + add(num1, num2));
        System.out.println("8 - 2 = " + sub(num1, num2));
        System.out.println("8 * 2 = " + mul(num1, num2));
        System.out.println("8 / 2 = " + div(num1, num2));
    }
}
