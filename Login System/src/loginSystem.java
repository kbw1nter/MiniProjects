import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        boolean loginSuccessful = false;

        System.out.println("=== Login ===");

        while(!loginSuccessful) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login succeeded. Welcome!");
                loginSuccessful = true; // Esta linha vai parar o loop
            } else {
                System.out.println("Incorrect username or password. Try again.");
                System.out.println();
            }
        }

        scanner.close();
    }
}