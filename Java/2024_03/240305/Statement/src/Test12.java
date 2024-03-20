public class Test12 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(true) {
            if (i % 3 == 0) {
                i+=1;
                continue;
            }

            sum += i;
            if (sum > 100) {
                break;
            }

            i+=1;
        }

        System.out.println(sum);
    }
}
