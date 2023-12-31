package Inlämningsuppgift.PartTwoVg;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VgTester {
    @Test
    public void testAmountOfRowsAndIncrement() {
        //Arrange
        AmountVg method = new AmountVg();

        //Act
        int actual = method.getAmountRows();
        int expected = 0;

        //Actual
        assertEquals(expected, actual);
    }

    @Test
    public void testTheLongestWordWritten() {
        // Arrange
        AmountVg method = new AmountVg();
        ArrayList<String> listWithItems = new ArrayList<>();
        listWithItems.add("Gaming-Computer");
        listWithItems.add("FlyingCar");
        listWithItems.add("EpicUltraQuadTvCore");

        // Act
        method.setListWithWords(listWithItems);
        String longestWord = method.getTheLongWord();

        // Assert
        assertEquals("EpicUltraQuadTvCore", longestWord);
    }

    @Test
    public void testAmountOfChars() {
        //Arrange

        AmountVg method = new AmountVg();
        String input = "12345678";

        // Act
        int actual = method.getAmountChars(input);

        // Assert
        int expected = input.length();
        assertEquals(expected, actual);
    }
}