package InClass;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("What year do you graduate?");
        int gradYear = myScanner.nextInt();
        System.out.println("What is your favorite color?");
        String color = myScanner.nextLine();
        myScanner.close();

        System.out.println("Hey " + name + " you graduate in " + gradYear + " and like " + color);
    }
}
