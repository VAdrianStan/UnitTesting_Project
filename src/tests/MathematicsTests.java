package tests;

import classes.Mathematics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathematicsTests {

    private Mathematics m;

    @Before
    public void setup(){
        m = new Mathematics();
        System.out.println("Object initialized");
    }

    @Test
    public void addTwoNumbersTest() {
        // AAA
        // Arrange - partea in care pregatim metoda pentru a fi apelata

//        Mathematics m = new Mathematics(); -> am facut-o globala la un moment dat

        // Act - partea in care se actioneaza ( apelam metoda)

        int actualResult = m.addTwoNumbers(2,3);

        // Assert - partea in care se adevereste (assertion) ca rezultatul (actual) este cel dorit (expected)

        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateAverageTest() {
        int actualResults = m.calculateAverage(1, 2, 3);
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, actualResults);
    }

    @Test
    public void findMaxWhenSecondArgumentIsGreaterTest() {
        int actualResult = m.findMax(1,2);
        int expectedResults = 2;

        Assert.assertEquals(expectedResults, actualResult);
    }

    @Test
    public void findMaxWhenFirstArgumentIsGreaterTest() {
        int actualResult = m.findMax(1,2);
        int expectedResults = 2;

        Assert.assertEquals(expectedResults, actualResult);
    }
}
