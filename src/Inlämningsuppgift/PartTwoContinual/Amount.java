package Inlämningsuppgift.PartTwoContinual;

public class Amount {
    private int amountChars = 0;
    private int amountRows = 0;
    public int getAmountChars(String input) {
        return amountChars += input.length();
    }
    public int getAmountRows() {
        return amountRows++;
    }
    public void info(){
        System.out.println("Total amount written characters: " + getAmountChars(""));
        System.out.println("Total amount written rows: " + getAmountRows());
    }
}
