public class arithmeticVariables {
    
    public static void main(String[] args){

        byte byteMinValue=Byte.MIN_VALUE;
        // byte byteMaxValue=Byte.MAX_VALUE;

        // byte newBytevalue=(byteMinValue/2); = value in a paranthesis is always considered as a int type, so we are getting the error                                   
        //Casting= convert a number from one type to another
        byte newBytevalue=(byte)(byteMinValue/2); 
        System.out.println(newBytevalue);

        // short shortMinValue=Short.MIN_VALUE;
        short shortMaxValue=Short.MAX_VALUE;
        short newShortvalue=(short)(shortMaxValue/2); 
        System.out.println(newShortvalue);

    }
}
