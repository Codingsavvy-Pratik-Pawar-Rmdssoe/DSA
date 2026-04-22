
import java.util.Scanner;

public class lcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM is: " + lcm);
        sc.close();
    }
}

