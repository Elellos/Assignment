package Inlämningsuppgift.PartTwoVg;

public class PartTwoVg {
    public static void main(String[] args) {
        AmountVg method = new AmountVg();
        System.out.println("1.Type (Stop), to stop counting rows and chars and to recieve feedback.\n2.Type (Check), to check how many rows and chars you have thus far.\n" +
                "3.Type (Words), to check the words you typed.");
        method.displaying();
    }
}
