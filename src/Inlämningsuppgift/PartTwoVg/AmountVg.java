package Inlämningsuppgift.PartTwoVg;

import java.util.ArrayList;
import java.util.Scanner;

public class AmountVg {
    private int amountChars = 0;
    private int amountRows = 0;
    private ArrayList<String> listWithWords = new ArrayList<>();

    public int getAmountChars(String input) {
        return amountChars += input.length();
    }

    public int getAmountRows() {
        return amountRows++;
    }

    public void info() {
        System.out.println("Total amount written characters: " + getAmountChars(""));
        System.out.println("Total amount written rows: " + getAmountRows());
    }

    public void list(ArrayList<String> listWithWords) {

        //Enchanded for loop "For Each"
        //  for (String word : listWithWords) {
        //            System.out.print(word + " ");
        //        }
        for (int i = 0; i < listWithWords.size(); i++) {
            String word = listWithWords.get(i);
            System.out.print(word + " ");
        }
    }

    // Metoden nedan tar input från användaren, och kontrollerar vad som skrivs.
    public void displaying() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.equalsIgnoreCase("check")) {
                info();
            } else if (input.equalsIgnoreCase("words")) {
                list(listWithWords);
            } else {
                System.out.println(input);
                listWithWords.add(input);
                getAmountChars(input);
                getAmountRows();
            }
        }
        System.out.print("The following words/sentences have been typed: ");
        list(listWithWords);
        System.out.println();
        info();
        System.out.println("The Longest Word/Sentence: " + getTheLongWord());
    }

    public String getTheLongWord() {
        String longestWord = "";  // Initialize to an empty string
        for (String word : listWithWords) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;  // Return the found longest word
    }

    public void setListWithWords(ArrayList<String> listWithWords) {
        this.listWithWords = listWithWords;
    }
}
