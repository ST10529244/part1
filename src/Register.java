
import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        Login auth = new Login();

        // ---------------- REGISTER ----------------
        System.out.println("=== REGISTER ===");

        String message;
        do {
            System.out.print("Enter First Name: ");
            String fName = input.nextLine();

            System.out.print("Enter Last Name: ");
            String lName = input.nextLine();

            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            System.out.print("Enter Phone Number (+27...): ");
            String phone = input.nextLine();

            message = auth.registerUser(fName, lName, username, password, phone);
            System.out.println(message);

        } while (!message.equals("Registration successful!"));

        // ---------------- LOGIN ----------------
        System.out.println("\n=== LOGIN ===");

        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            loggedIn = auth.loginUser(username, password);
            System.out.println(auth.returnLoginStatus(loggedIn));
        }

        input.close();
    }
    
}