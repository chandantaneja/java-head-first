package DotCom;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int num = (int) (Math.random() * 5);
        String randomNum = Integer.toString(num);
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(randomNum);
        locations.add(randomNum + 1);
        locations.add(randomNum + 2);
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("enter a number ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kills")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses  + " guesses...s");
            }
        }
    }
}
