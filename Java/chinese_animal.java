//getting import for input
import java.util.Scanner;

public class chinese_animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to know your Chinese Animal?");
        System.out.println("Enter the year you were born.");
//input for year
        System.out.print("Year (0000): ");
        int birthYear = scanner.nextInt();
        scanner.close();
//calling chin_ani function to get the chinese animal
        String chineseAnimal = chin_ani(birthYear);
//results output
        System.out.println("################################################");
        System.out.println("Your Chinese zodiac animal is: " + chineseAnimal);
        System.out.println("################################################");
    }
//function to get the chinese animal (calculates for both years before and after 2000)
    private static String chin_ani(int year) {
        String[] animals = {"Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit"};
        int startYear = 2000;
        int cycleIndex = (year - startYear) % 12;
        if (cycleIndex < 0) {
            cycleIndex += 12;
        }
        return animals[cycleIndex];
    }
}