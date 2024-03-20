public class Post {
    private String author;
    private String contents;
    private int likes;

    public int getLikes() {
        return likes;
    }

    public String like(){
        String click = "좋아요 클릭";
        likes += 1;
        return click;
    }
}
