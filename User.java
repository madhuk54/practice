package practice;


public class User {
    public static void main(String[] args) {
        // Hardcoded input values (can later be replaced with args[] or Scanner)
        String email = "user@example.com";
        String mobile = "9876543210";
        String securityQuestion = "What is your pet's name?";
        String securityAnswer = "Fluffy";
        boolean termsAccepted = true;
        boolean captchaPassed = true;

        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Security Question: " + securityQuestion);
        System.out.println("Security Answer: " + securityAnswer);

        if (termsAccepted && captchaPassed) {
            System.out.println("User registered successfully with email: " + email);
        } else {
            System.out.println("Registration failed. Check captcha or terms.");
        }
    }
}


