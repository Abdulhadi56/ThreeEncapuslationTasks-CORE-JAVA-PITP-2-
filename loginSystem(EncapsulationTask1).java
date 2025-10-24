//PITP 2 --- Core Java --- Muhammad Abdul Hadi Khawaja ---- Login System Task(Encapsulation)

import java.util.Scanner;

class Login {
    // Encapsulated fields (private)
    private String username;
    private String password;

    // Setter methods
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter methods (optional, but here for verification)
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public boolean validateLogin(String enteredUser, String enteredPass) {
        return enteredUser.equals(username) && enteredPass.equals(password);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login user = new Login();

        user.setUsername("admin");
        user.setPassword("12345");

        System.out.print("Enter Username: ");
        String u = input.nextLine();

        System.out.print("Enter Password: ");
        String p = input.nextLine();

        if (user.validateLogin(u, p)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials!");
        }
    }
}