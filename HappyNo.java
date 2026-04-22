
import java.util.HashSet;
import java.util.Scanner;

public class HappyNo {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = addNo(n);
        }

        return n == 1;
    }

    private static int addNo(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappy(num))
            System.out.println(num + " is a Happy Number ");
        else
            System.out.println(num + " is NOT a Happy Number ");

        sc.close();
    }
}