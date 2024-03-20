package workbook4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "동물";

        Dog dog = new Dog();
        dog.name = "멍멍이";

        animal.printAction();
        dog.printAction();
    }
}
