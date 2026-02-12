class LoginSystem {

    public static void main(String[] args) {

        // Login using username and password
        login("prajwal123", "pass@123");

        // Login using email and OTP
        login("prajwal@gmail.com", 56789);
    }

    // Login using username and password
    public static void login(String username, String password) {
        System.out.println("Login using Username & Password");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Login Successful\n");
    }

    // Login using email and OTP
    public static void login(String email, int otp) {
        System.out.println("Login using Email & OTP");
        System.out.println("Email: " + email);
        System.out.println("OTP: " + otp);
        System.out.println("Login Successful\n");
    }
}
