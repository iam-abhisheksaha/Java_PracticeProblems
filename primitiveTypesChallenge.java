public class primitiveTypesChallenge {
    
    public static void main(String[] args){

        byte byteNum= 123;
        short shortNum= 12345;
        int intNum= 1239;

        long finalValue=50000L*10L*(byteNum+shortNum+intNum);
        System.out.println(finalValue);

        short shortFinalValue= (short)(1000+10*
                (byteNum+shortNum+intNum));
        System.out.println(shortFinalValue);
    }
}
