public class bitManipulationClearBit {

    // Clear Bit = Making the given position of the bit 0
    public static void main(String[] args) {

        int numbers = 5
        int position = 2;
        int bitMask = 1 << position

        bitMask = ~(bitMask);
        int newNumber = (bitMask & numbers);
        System.out.println(newNumber);
    
}
