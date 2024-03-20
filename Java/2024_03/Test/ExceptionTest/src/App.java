import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{    
            File file = new File("test.txt");
            Scanner scan;
            scan = new Scanner(file);
            while(scan.hasNext()){
                System.out.println(scan.next());
            }
        } catch(FileNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
