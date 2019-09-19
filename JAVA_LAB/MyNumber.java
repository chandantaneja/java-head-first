package JAVA_LAB;

import java.util.Scanner;

public class MyNumber {
    private int number;

    public MyNumber() {
        number = 0;
    }

    private MyNumber(int number) {
        this.number = number;
    }

    private void isNegative(){
        if (number < 0){
            System.out.println("OMG! The number is negative ");
        }
    }

    private void isPositive(){
        if (number > 0){
            System.out.println("OMG! The number is positive ");
        }
    }

    private void isZero(){
        if (number == 0){
            System.out.println("The number is zero ");
        }
    }

    private void isEven(){
        if (number % 2 == 0 && number != 0){
            System.out.println("OMG! The number is Even ");
        }
    }

    private void isOdd(){
        if (number % 2 != 0){
            System.out.println("OMG! The number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        MyNumber myNumber = new MyNumber(inputNumber);

        myNumber.isEven();
        myNumber.isOdd();
        myNumber.isZero();
        myNumber.isPositive();
        myNumber.isNegative();
    }


}
