package CodingExamples;

import java.util.Scanner;

public class Tecken {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Skriv vänligen ett tecken");
            String input = scan.nextLine();
            if (input.length() > 1 || input.length() <= 0){
                System.out.println("Ogiltigt antal tecken");
            } else {
                System.out.println(input);
            }

            if (input.equalsIgnoreCase("*")){
                break;

            }
        }
    }
}
