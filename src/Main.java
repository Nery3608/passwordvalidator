import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid = false;

        System.out.println("=== PASSWORD VALIDATOR ===");
        System.out.println("Password Requirements:");
        System.out.println("- At least 8 characters long");
        System.out.println("- At least one uppercase letter");
        System.out.println("- At least one lowercase letter");
        System.out.println("- At least one digit (0-9)");
        System.out.println();

        boolean hasMinLength;
        boolean hasUpperCase;
        boolean hasLowercase;
        boolean hasDigit;

        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            hasMinLength = hasMinimumLength(password);
            if (!hasMinLength) {
                System.out.println("Password length Minimum not met. ");
            }
            hasUpperCase = hasUppercase(password);
            if (!hasUpperCase) {
                // TODO: print appropriate message
                System.out.println("Password length Error: More Uppercase! ");
            }
            hasLowercase = hasLowercase(password);
            if (!hasLowercase) {
                // TODO: print appropriate message
                System.out.println("Password length Error: More Lowercase! ");
            }
            hasDigit = hasDigit(password);
            if (!hasLowercase) {
                // TODO: print appropriate message
                System.out.println("Password length Error: More Digit! ");
            }

        } while (!hasMinLength || !hasLowercase || !hasUpperCase || !hasDigit);

        System.out.println("Your password is valid");

        scanner.close();

    }

    // TODO: Create method to check if password has minimum length
    public static boolean hasMinimumLength(String password) {
        return password.length() >= 8;

    }

    // TODO: Create method to check if password has uppercase letter
    public static boolean hasUppercase(String password) {
        int i = 0;
        while (i < password.length()) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
            i++;
        }

        return false;

    }

    // TODO: Create method to check if password has lowercase letter
    public static boolean hasLowercase(String password) {
        int i = 0;
        while (i < password.length()) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
            i++;
        }
        return false;
    }
    // TODO: you do.


    // TODO: Create method to check if password has at least one digit
    public static boolean hasDigit(String password) {
        int i = 0;
        while (i < password.length()) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
            i++;
        }
        return false;

        // TODO: you do.
    }
}