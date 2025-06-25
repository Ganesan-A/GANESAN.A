import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}
