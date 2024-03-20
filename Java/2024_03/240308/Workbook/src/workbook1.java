public class workbook1 {

    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", 5);
        Mammal mammal = new Mammal("Panda", 3, "Black and White");

        animal.printDetails();
        mammal.printDetails();
    }
}