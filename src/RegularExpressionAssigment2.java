public class RegularExpressionAssigment2 {
    public static boolean checkWebAddressValidity(String webAddress){
        String regex = "^(https?|ftp)://www\\.[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return webAddress.matches(regex);
    }

    public static void main(String[] args) {

        String webAddress = "https://abcd12.org";
        System.out.println("The web Address "+(checkWebAddressValidity(webAddress)?"Valid":"Invalid"));
    }
}
