import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("#1 Declare and initialize an array");
        int[] scores = {95, 100, 87, 91};
        scores[2] = 90;

        System.out.println("## println scores = " + scores);
        for(int i=0; i<scores.length; i++){
            System.out.println("# for println scores = " + scores[i]);
        }

        System.out.println("\n#2 Arrays method : ToString(), asList()");
        String[] cars = {"hyundal", "bmw", "benz", "toyota"};

        System.out.println("## println cars = " + cars.toString());

        List<String> carList = Arrays.asList(cars);
        System.out.println("## println carList = " + carList.toString());
        System.out.println("## println carList.get(1) = " + carList.get(1));
        
        System.out.println("\n#3 Arrays method : sort(array, Comparator), sor(array, int fromIndex, int toIndex)");
        Arrays.sort(cars);
        System.out.println("## println Arrays.sort(cars) = " + cars.toString());

        Arrays.sort(cars, Collections.reverseOrder());
        System.out.println("## println Arrays.sort(cars, Collections.reverseOrder()) = " + cars);

        Arrays.sort(cars, 0, 2);
        System.out.println("## println Arrays.sort(cars, 0, 2)");

        System.out.println("\n#4 Arrays method : copyOf, copyOfRange");
        String[] carsCopied1 = Arrays.copyOf(cars, cars.length);
        System.out.println("## println carsCopied1 = " + Arrays.toString(carsCopied1));
        
        String[] carsCopied2 = Arrays.copyOfRange(cars, 0, 2);
        System.out.println("## println carsCopied2 to Arrays.asList" + Arrays.asList(carsCopied2));

        System.out.println("\n#5 Multiple Array");
        int[][][] allScores = {
            { { 90, 85, 70, 55, 60 }, { 96, 88, 81, 91, 75 }, { 96, 88, 81, 91, 75 }, { 96, 88, 81, 91, 75 } },
            { { 91, 82, 73, 54, 65 }, { 96, 87, 88, 99, 80 }, { 91, 82, 83, 94, 75 }, { 96, 87, 88, 99, 70 } },
            { { 92, 83, 74, 55, 66 }, { 97, 88, 89, 90, 71 }, { 92, 83, 84, 95, 76 }, { 97, 88, 89, 90, 71 } } };

        System.out.println("## println System.out.println(allScores[1][2][0]) = " + allScores[1][2][0]);
    }
}
