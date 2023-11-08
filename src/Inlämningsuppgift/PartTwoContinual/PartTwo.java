package Inlämningsuppgift.PartTwoContinual;

import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        Amount calc = new Amount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type stop, to stop counting rows and chars.\nType check, to check how many rows and chars you have thus far.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.equalsIgnoreCase("check")) {
                calc.info();
            } else {
                System.out.println(input);

                //Kallar på metoden getAmountChars som retunerar en int av antal karaktärer.
                //Detta görs genom att läsa input från användaren.
                calc.getAmountChars(input);
                calc.getAmountRows();
            }
        }
        // Kallar på metoden info som printar ut antal karaktärer och rader.
        calc.info();
    }
}
