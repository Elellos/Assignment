package Inlämningsuppgift.PartTwoContinual;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {
    Amount testOne = new Amount();
    PartTwo testTwo = new PartTwo();


    @Test
    public void testingAmountChars() {
        int actual = testOne.getAmountChars("PartTwo");
        int expectedOne = 7;
        assertEquals(expectedOne, actual);
    }

    @Test
    public void testingAmountRows() {
        int checkRow = testOne.getAmountRows();
        assertEquals(0, checkRow);
        checkRow++;
        assertEquals(1, checkRow);
    }

    @Test
    public void testGetAmountRows(){
        int expected = 0;
        assertEquals(expected, testOne.getAmountRows());
    }

    @Test
    public void testGetAmountChars(){
        int expected = 0;
        assertEquals(expected, testOne.getAmountChars(""));
    }

}
