import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int num = scan.nextInt();

        System.out.println(name);
        System.out.println(num);

        Logger logger = Logger.getLogger("MyLogger");
        logger.info("Main Program Start!");
        logger.log(Level.WARNING, "Data file size too big!");

        logger.setLevel(Level.FINE);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.FINE);
        logger.addHandler(ch);

        logger.fine("shutdown main program");
    }
}
