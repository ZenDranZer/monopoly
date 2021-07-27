package util;


import java.util.Random;

public class Dice {

    /**a method which rolls a dice and provides numbers between 1 to 6.
     * @return an integer value specifying the dice top surface number.*/
    public static int rollDice() {
        Random randomNumberGenerator = new Random();
        int firstDiceNumber = randomNumberGenerator.nextInt(6);
        int secondDiceNumber = randomNumberGenerator.nextInt(6);
        int diceNumber = firstDiceNumber + secondDiceNumber + 2;
        return diceNumber;
    }
}
// ON LUNCH
//be back at 2:50pm EST