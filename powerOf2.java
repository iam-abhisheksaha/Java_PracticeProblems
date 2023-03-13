import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if (number == 1) {
            System.out.println("Not Power of 2");
        } else {
            while (number != 0) {

                if (number % 2 != 0) {
                    count++;
                }
                number = number / 2;
            }
            if (count == 1) {
                System.out.println("Power of 2");
            } else {
                System.out.println("Not power of 2");
            }
        }
        scanner.close();
    }
}
