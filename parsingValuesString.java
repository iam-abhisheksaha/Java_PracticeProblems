public class parsingValuesString {
    
    public static void main(String[] args){

        String numberAsString="2018";
        System.out.println("numberAsString = " + numberAsString);
        
        int number=Integer.parseInt(numberAsString);
        number = number*2;
        System.out.println(number);

        //Double
        double dnumber=Double.parseDouble(numberAsString);
        dnumber = dnumber*2;
        System.out.println(dnumber);
    }
}
