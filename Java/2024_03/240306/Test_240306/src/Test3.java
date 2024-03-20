public class Test3 {
    public static void main(String[] args) {
        // 아래 코드는 검사용으로 수정하지 말아주세요
        User user1 = new User();

        // [1] : User 클래스 내부에 있는 변수의 접근 제어자를 수정하여 오류가 나지 않도록 해주세요.
        System.out.println(user1.ID);

        // [2] : User 클래스 내부에 있는 메소드의 접근 제어자를 수정하여 오류가 나지 않도록 해주세요.
        System.out.println(user1.IdViewer());

    }
}
