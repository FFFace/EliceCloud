public class EliceTypeTest3 {
    public static void main(String[] args) {
        // 반지름을 저장하는 변수입니다.
        int radius = 10;

        // 원주율을 나타내는 상수입니다. 변경될 일이 없으므로 상수로 선언하였습니다.
        final double PI = 3.141592;


        // 지시사항 1번을 참고하여 코드를 작성하세요.
        double volume = 4.0 / 3.0 * PI * (radius * radius * radius);

        System.out.println(volume);

        // 반지름을 변경하였습니다.
        radius = 20;

        // 지시사항 2번을 참고하여 코드를 작성하세요.
        volume = 4.0 / 3.0 * PI * (radius * radius * radius);

        System.out.println(volume);
    }
}
