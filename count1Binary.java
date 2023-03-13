

public class count1Binary {
    public static void main(String[] args) {

        int number = 5;
        String decimalBinary = Integer.toBinaryString(number);
        // System.out.println(decimalBinary);

        int binaryLength = decimalBinary.length();
        int i = 0;
        int count = 0;
        while (i < binaryLength) {

            if (decimalBinary.charAt(i) == '1') {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
