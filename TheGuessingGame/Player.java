package TheGuessingGame;
/**
Created with <3 by:-
Chadnan Taneja
*/
class Player {
    int number = 0;
    void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + number);
    }
}
