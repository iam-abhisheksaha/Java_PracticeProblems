import java.util.Scanner;

public class bitManipulationUpdateBit {

    // Update Bit = Make '0'='1' or make '1'='0' in binary
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        // Operation = 1 : Set
        // Operation = 0 : Clear

        int number = 5;
        int position = 1;
        int bitMask = 1 << position;

        if (operation == 1) {
            // Set
            int newNumber = number | bitMask;
            System.out.println(newNumber);
        } else {
            // Clear
            bitMask = ~(bitMask);
            int newNumber = number & bitMask;
            System.out.println(newNumber);
        }
        scanner.close();
    }
}
