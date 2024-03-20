public class workbook4 {
    public static void main(String[] args) {
        Post p = new Post();
        System.out.println(p.getLikes());

        for (int i = 0; i < 5; i++) {
            p.like();
        }

        System.out.println(p.getLikes());
    }
}
