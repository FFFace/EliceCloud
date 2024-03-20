package workbook1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = scanner.nextDouble();

        FamilyBusinessAccount familyAccount = new FamilyBusinessAccount(initialBalance);

        familyAccount.displayBalance();

        scanner.close();
    }
}