package practice;

class User {
    String email = "user@example.com";
    String mobile = "9876543210";
    String securityQuestion = "What is your pet's name?";
    String securityAnswer = "Fluffy";
    boolean termsAccepted = true;
    boolean captchaPassed = true;

    void register() {
        if (termsAccepted && captchaPassed) {
            System.out.println("User registered successfully with email: " + email);
        } else {
            System.out.println("Registration failed. Check captcha or terms.");
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.register();
    }
}

