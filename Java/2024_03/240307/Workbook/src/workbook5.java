public class workbook5 {
    public static void main(String[] args) {

        Cafe cafe = new Cafe("아이스크림");
        Cafe cafe2 = new Cafe("아이스크림", 3000);

        cafe.printMenuInfo();
        cafe2.printMenuInfo();
    }
}
