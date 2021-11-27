package example3;

import java.util.Random;
import java.util.Scanner;

public class Account {

    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String password;
    private int mailBoxCapacity = 500;
    private String domainName = ".company.com";

    public Account(String firstName, String lastName, String email, String department, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
    }

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = assignDepartment();
        this.password = autoPasswordCreator();
        this.email = autoEmailEntry();

//        this.password = generatePassword();
//        this.email = generateEmail();
    }

    private String autoEmailEntry() {
        email = firstName + lastName + "@" + department + domainName;
        return email;
    }

    private String autoPasswordCreator() {

        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[8];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < 8; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return new String(password);
    }


//    private String generateEmail() {
//        Random random = new Random();
//        String randomCharacterList = "[a-zA-Z0-9_\\-\\.]";
//        String email = "";
//        int length = random.nextInt(6) + 5;
//        while (email.length() < length) {
//
//            char character = (char) random.nextInt(128);
//            if (Character.toString(character).matches(randomCharacterList)) {
//
//                email += character;
//            }
//        }
//        email += "@" + department + domainName;
//        return email;
//    }

//    private String generatePassword() {
//        String passwordSymbolSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        char[] password = new char[8];
//        for (int i = 0; i < password.length; i++) {
//            int randomNumber = (int) (Math.random() * passwordSymbolSet.length());
//            password[i] = passwordSymbolSet.charAt(randomNumber);
//        }
//
//        return new String(password);
//    }

    private String assignDepartment() {
        System.out.println("Enter the department \n 1 for Sales \n 2 for Accounting \n 3 for Development");
        Scanner scanner = new Scanner(System.in);
        int departmentSelection = scanner.nextInt();

        if (departmentSelection == 1) {
            return "Sales";
        } else if (departmentSelection == 2) {
            return "Accounting";
        } else if (departmentSelection == 3) {
            return "Development";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
