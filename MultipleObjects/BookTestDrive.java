package MultipleObjects;
/**
Created with <3 by:-
Chadnan Taneja
*/
import java.util.Scanner;

public class BookTestDrive {
    public static int [] hello = new int[100];
    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        Book c = new Book();
        Book d = a;
        Book[] myBOoks = new Book[3];
        myBOoks[1].test = 1234;

//updates the last updated value
        b.test = 1000;
        c.test = 700;
        d.test = 4545;

        System.out.println(a.test);
        System.out.println(b.test);
        System.out.println(c.test);
        System.out.println(d.test);

                a.test = 500;
                c=b;


        System.out.println(a.test);
        System.out.println(c.test);
        System.out.println(d.test);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10; i++){
           hello[i] = scanner.nextInt();
        }
        for (int i = 0; i<10 ; i++){
            System.out.println(hello[i]);
        }


    }

}
