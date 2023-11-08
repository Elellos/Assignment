package Inlämningsuppgift.PartTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Skapar 2 variabler av typen int.
        int amountChars = 0;
        int amountRows = 0;

        // Initiserar scanner som kommer användas till att läsa innehåll från användaren.
        Scanner scanner = new Scanner(System.in);

        //Körs så länge det är true. Om stop skrivs av användaren så hoppar vi ut från loopen.
        //Då sammanställs antal karaktärer som skrivits samt antal rader.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                System.out.println(input);
            }

            //amountChars läser in längden av användarens inputs och summerar längden.
            //amountRows är en simpel counter som bara räknar upp.
            amountChars += input.length();
            amountRows++;
            System.out.println("Written characters: " + amountChars);
            System.out.println("Written rows: " + amountRows);
        }
    }
}



