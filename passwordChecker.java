import java.util.*;

public class passwordChecker {

    public static void passwordChanger(String existingPassword, String newPassword, String newConfirmedPassword,
            String currentPassword) {

        if (currentPassword == existingPassword) {

        }
    }

    public static void main(String[] args) {

        String existingPassword = "random";
        String newPassword;
        String newConfirmedPassword;

        Scanner sc = new Scanner(System.in);

        System.out.println("PASSWORD CHANGER\n");

        System.out.println("Enter Current password:\n");
        String currentPassword = sc.nextLine();

        while (existingPassword.compareTo(currentPassword) != 0) {
            System.out.println("Invalid entry, try again!\n");
            System.out.println("Enter Current password:\n");
            currentPassword = sc.nextLine();
        }

        System.out.println("Enter new password:\n");
        newPassword = sc.nextLine();

        System.out.println("Confirm password:\n");
        newConfirmedPassword = sc.nextLine();

        while (newPassword.compareTo(newConfirmedPassword) != 0) {
            System.out.println("New password and confirm password do not match, try again!");
            System.out.println("Enter new password:\n");
            newPassword = sc.nextLine();

            System.out.println("Confirm password:\n");
            newConfirmedPassword = sc.nextLine();
        }

        while (newConfirmedPassword.compareTo(currentPassword) == 0) {
            System.out.println("New password same as old password, try again!");
            System.out.println("Enter new password:\n");
            newPassword = sc.nextLine();

            System.out.println("Confirm password:\n");
            newConfirmedPassword = sc.nextLine();
        }

        existingPassword = newConfirmedPassword;
        System.out.println("Password changed successfully!");
    }

}
