package Assignment45;

public class Assignment45 {
    public static void main(String[] args) {
        String name = "  aman kumar maurya  ";
        String email = "Aman@Gmail.com";
        String password = "mypassword213";

        System.out.println("===== Validate and fix fullName =====");

        String trimmedName = name.trim();
        System.out.println("Trimmed Name: " + trimmedName);
        System.out.println("Upper Case: " + trimmedName.toUpperCase());
        System.out.println("Trimmed Name length: " + trimmedName.length());
        if (trimmedName.toLowerCase().contains("kumar")){
            System.out.println("Name contains 'kumar'");
        }else {
            System.out.println("Name does not contains 'kumar'");
        }

        System.out.println("\n===== Validate email =====");

        String fixedEmail = email.toLowerCase();
        System.out.println("Fixed Email: " + fixedEmail);
        if (!(fixedEmail.contains("@"))){
            System.out.println("Invalid Email");
        } else if (!(fixedEmail.endsWith(".com"))) {
            System.out.println("Invalid Domain");
        }else {
            System.out.println("Valid Email");
        }

        System.out.println("\n===== Validate password =====");

        if (password.length() < 8){
            System.out.println("Password too short!");
        }else {
            System.out.println("Password length OK. Length: " + password.length());
        }

        if (password.contains("123")){
            System.out.println("Weak password — avoid sequences!");
        }

        if (password.startsWith("my")){
            System.out.println("Avoid personal words in password!");
        }

        System.out.println("\n===== Name Split =====");
        String[] namePart = trimmedName.split(" ");
        System.out.println("First Name: " + namePart[0]);
        System.out.println("Middle Name: " + namePart[1]);
        System.out.println("Last Name: " + namePart[2]);
    }
}
