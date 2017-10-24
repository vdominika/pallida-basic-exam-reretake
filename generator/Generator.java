import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number, which is higher than 0");
        int inputNumber = myScanner.nextInt();
        System.out.println(generator(20));
    }

    public static void generator(int inputNumber){

    }
}

// Create a function that takes a whole number
// as parameter and generates a list containing
// all the FizzBuzz numbers smaller than that.
// FizzBuzz number is divideable by 3 or 5
// System.out.println(generator(20));
// should print out:
// [3, 5, 6, 9, 10, 12, 15, 18, 20]