import java.util.Scanner;
public class calculatorProg {
    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double sub(double a, double b) {
        double sub = a - b;
        return sub;
    }

    public static double mul(double a, double b) {
        double mul = a * b;
        return mul;
    }

    public static double div(double a, double b) {
        double div = a / b;
        return div;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input first Number:");
        double input1 = s.nextInt();
        double output = input1;
        char operator;

        while (true )
        {
            System.out.print("Input Operation to perform (+, -, x, / (e to exit) :");
            operator = s.next().charAt(0);
            if (operator == 'e'){
                System.out.println("EXITING ...");
                System.exit(0);
            }
            else if (operator != '+' && operator != '-' && operator != 'x' && operator != '/'){
                System.out.println("Invalid Operator ... Exiting");
                System.exit(1);
            }

            System.out.print("Input second number:");
            double inputNum = s.nextDouble();

            switch (operator) {
                case '+':
                    output = sum(output, inputNum);
                    break;
                case '-':
                    output = sub(output, inputNum);
                    break;
                case 'x':
                    output = mul(output, inputNum);
                    break;
                case '/':
                        output =div (output,inputNum);

                        break;
                default:
                    System.out.println("In-appropriate operation, Please try again");
                    System.exit(1);
            }
            System.out.println("Output :" + output);
        }
    }
}

