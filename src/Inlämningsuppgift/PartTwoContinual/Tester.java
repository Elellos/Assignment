package Inlämningsuppgift.PartTwoContinual;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tester {
    //Arrange <- Vi arrangerar vår testdata
    //Act <- Vi utför nödvändiga beräkningar etc.
    //Assert <- Vi kollar att vi får korrekt utfall.

    @Test
    public void testAmountOfChars() {
        //Arrange
        Amount method = new Amount();
        String input = "12345678";

        // Act
        int actual = method.getAmountChars(input);

        // Assert
        int expected = input.length();
        int expectedTest = 8;
        assertEquals(expected, actual);
        assertEquals(expectedTest, actual);
    }

    @Test
    public void testAmountOfRows() {
        //Arrange
        Amount method = new Amount();

        //Act
        int actual = method.getAmountRows();
        int expected = 0;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testIcrementingAmountofRows(){
        //Arrange
        Amount method = new Amount();

        //Act
        method.getAmountRows(); // Vi kallar på antal av rader för att öka med 1.
        int actual = method.getAmountRows();

        //Assert
        assertEquals(1, actual);
    }
}
