package package1;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(isValid("MyPassword%01"));
    }

    private static boolean isValid(String password) {
            String lowercase=".*[a-z].*";

            String uppercase=".*[A-Z].*";

            String numbers=".*[0-9].*";

            String specialchars=".*[!-/].*";

            boolean hasLower = password.matches(lowercase),
                    hasUpper = password.matches(uppercase),
                    hasDigits = password.matches(numbers),
                    hasSpecial = password.matches(specialchars),
                    valid = false;

            if(password.length() >= 6 && !password.contains(" "))
                if( hasLower && hasUpper && hasDigits && hasSpecial)
                    valid = true;
            return valid;

        }
}
