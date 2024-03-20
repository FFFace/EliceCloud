package workbook1;

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA("클래스 A");
        ClassB b = new ClassB("클래스 B");
        ClassC c = new ClassC("클래스 C");

        Basic basic = a;
        Intermediate intermediate = a;
        Advanced advanced = a;

        System.out.println(basic);
        System.out.println(intermediate);
        System.out.println(advanced);

        basic = b;
        intermediate = b;
//      advanced = b;           // 에러, ClassB는 Intermediate를 상속하지 않아 캐스팅 불가능

        System.out.println(basic);
        System.out.println(intermediate);
        System.out.println(advanced);

        basic = c;
//      intermediate = c;       //에러, ClassC는 Intermediate를 상속하지 않아 캐스팅 불가능
//      advanced = c;           //에러, ClassC는 Advanced를 상속하지 않아 캐스팅 불가능

        System.out.println(basic);
        System.out.println(intermediate);
        System.out.println(advanced);

//        a.reading();
//        a.listening();
//        a.speaking();
//        a.writing();
//
//        b.reading();
//        b.listening();
//        b.speaking();
//
//        c.reading();
//        c.listening();
    }
}