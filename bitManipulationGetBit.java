

public class bitManipulationGetBit {

    // Get Bit = Find out the bit whose position was given
    public static void main(String[] args) {

        int number = 5;
        int position = 2;
        int bitMask = 1 << position;

        if ((bitMask & number) != 0) {
            System.out.println("Bit was one");
        } else {
            System.out.println("Bit was zero");
        }
    }
}
