import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input
            System.out.print("Enter a number (a): ");
            int a = sc.nextInt();

            // If 'a' is even, reduce it by 1 to make it odd
            if (a % 2 == 0) {
                a = a - 1;
            }

            // Print first 'a' odd numbers
            for (int i = 0; i < a; i++) {
                int odd = 2 * i + 1;
                System.out.print(odd);

                if (i != a - 1) {
                    System.out.print(", ");
                }
            }

            sc.close();
        }
    }

