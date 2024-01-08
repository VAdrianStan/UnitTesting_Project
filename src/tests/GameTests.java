package tests;

import classes.Game;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GameTests {


    @Test
    public void playFizzBuzzWhenArgumentIs3Test(){
        String actualResult = Game.playFizzBuzz(3);
        String expectedResult = "Fizz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentIs5Test(){
        String actualResult = Game.playFizzBuzz(5);
        String expectedResult = "Buzz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentIs15Test(){
        String actualResult = Game.playFizzBuzz(15);
        String expectedResult = "FizzBuzz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentIs4Test(){
        String actualResult = Game.playFizzBuzz(4);
        String expectedResult = "4";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

}
