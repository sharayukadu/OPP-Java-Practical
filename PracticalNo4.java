/* Aim:- Practical No.3
   Author:- Sharayu Kadu
   Version:- 4.0
   Date:- 20 Feb 2024
*/
public class PracticalNo4 {

    public static void main(String[] args) {
        // Example usage:
        printName("  Bill   Joy  ");
    }

    // Your code goes here
    public static void printName(String fullName) {
        // Remove leading and trailing spaces
        fullName = fullName.trim();

        // Split the full name into first and last names
        String[] names = fullName.split("\\s+");

        // Check if there are at least two names
        if (names.length >= 2) {
            // Reformat and print the name
            String formattedName = names[names.length - 1] + ", " + names[0];
            System.out.println(formattedName);
        } else {
            System.out.println("Invalid name format");
        }
    }
}
