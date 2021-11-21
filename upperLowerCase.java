public class upperLowerCase {
    static void checkUpperLower(char ch)
    {
        if (ch >='A' && ch <='Z') {
            System.out.println(ch + " is an UpperCase charecter");
        }else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an LowerCase charecter");
        }
        else {
            System.out.println(ch + " is not an alphabetic charecter");
        }
    }
    public static void main(String[] args) {
        char ch;
        ch = '2';
        checkUpperLower(ch);
    }
}
