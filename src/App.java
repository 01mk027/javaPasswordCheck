import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String username, password, passwordChangeRequest, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password:");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123"))
        {
            System.out.println("You've entered system successfully.");
        }
        else{
            System.out.println("One or all of the entry parameters are wrong");
            System.out.println("Do you want to change your password? (Y)");
            passwordChangeRequest = input.nextLine();
            if(passwordChangeRequest.equals("Y"))
            {
                System.out.println("Please enter your new password:");
                newPassword = input.nextLine();
                if(!newPassword.equals("java123") && !newPassword.equals(password))
                {
                    System.out.println("New password is created successfully.");
                }
                else
                {
                    System.out.println("Creating new password is failed, please re-enter your new password.");
                } 
            }
        }
    }
}
