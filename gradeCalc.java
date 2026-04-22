import java.util.Scanner;

public class gradeCalc {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int mark;

        while (true) {
            System.out.println("Enter mark (-1 to end): ");
            mark = sc.nextInt();

            if (mark == -1)
                break;

            sum += mark;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            if (average >= 90)
                System.out.println("Grade O");
            else if (average >= 80)
                System.out.println("Grade A");
            else if (average >= 70)
                System.out.println("Grade B");
            else if (average >= 60)
                System.out.println("Grade C");
            else
                System.out.println("Grade P");
        }
    }
}
