public class bitManipulationSetBit {

    // Set Bit = Making the bit of desired position 1
    public static void main(String[] args) {

        int number = 5;
        int position = 1;
        int bitMask = 1 << position;

        int newNumber = number | bitMask;
        System.out.println(newNumber);
    }
}
