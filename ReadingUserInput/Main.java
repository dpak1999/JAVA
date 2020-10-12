import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}
//nextBoolean() 	Reads a boolean value from the user
//nextByte() 	Reads a byte value from the user
//nextDouble() 	Reads a double value from the user
//nextFloat() 	Reads a float value from the user
//nextInt() 	Reads a int value from the user
//nextLine() 	Reads a String value from the user
//nextLong() 	Reads a long value from the user
//nextShort() 	Reads a short value from the user
