public class App {

    public static void main(String[] args) throws Exception {
        Storage<String> storage1 = new Storage<>();
        storage1.setter("MyItem"); 
        System.out.println(storage1.getter());

        Storage<Integer> storage2 = new Storage<>();
        storage2.setter(20240221);
        System.out.println(storage2.getter());

        Parent p1 = new Parent();
        Child c1 = (Child)p1;

        Child c2 = new Child();
        Parent p2 = c2;
    }
}
