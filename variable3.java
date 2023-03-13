public class variable3 {
    
    public static void main(String[] args) {
        
        //Byte data type
        byte byteMinValue=Byte.MIN_VALUE;
        byte byteMaxValue=Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + byteMinValue);
        System.out.println("Byte maximum value = " + byteMaxValue);

        //Short data type
        short shortMinValue=Short.MIN_VALUE;
        short shortMaxValue=Short.MAX_VALUE;
        System.out.println("Short minimum value = " + shortMinValue);
        System.out.println("Short maximum value = " + shortMaxValue);

        //long data type
        long longValue= 100L;   //Long data type must contain the value that end's with a 'l' or 'L'
        System.out.println(longValue);
        long longMinValue=Long.MIN_VALUE;
        long longMaxValue=Long.MAX_VALUE;
        System.out.println("Long minimum value = " + longMinValue);
        System.out.println("Long maximum value = " + longMaxValue);
        // long litetalValue=123456789123; = without 'L' or 'l' it will shows error because the value is out of integer range
        long litetalValue= 123456789123L;
        System.out.println(litetalValue);



    }
    
}
