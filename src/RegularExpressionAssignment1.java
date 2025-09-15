public class RegularExpressionAssignment1 {
    public static boolean checkPasswordValidity(String password) {
        //Implement your code here and change the return value accordingly
        if (password == null || password.length() < 8 || password.length() > 20) {
            return false;
        }

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$%&#*])[^\\s]{8,20}$";

        return password.matches(regex);
    }

    public static void main(String[] args) {

        //Change the value of password for testing your code with different passwords
        String password = "Alexm arry2@";
        System.out.println("The password is " + (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }
}