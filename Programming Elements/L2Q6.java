import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,quotient,remainder;
        a = input.nextDouble();
        b = input.nextDouble();
        quotient = a/b;
        remainder = a%b;
        System.out.println("The Quotient is" + quotient);
        System.out.println("The Remainder is" + remainder);
    }
}