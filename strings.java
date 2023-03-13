public class strings {
    
    public static void main(String[] args){

        String myString = "Abhishek";
        myString = myString+" \u0044";  //Merging unicode character with String
        myString=myString+" Saha";
        System.out.println("My name is " + myString);


        String numberString="12345.6";
        numberString=numberString+"78910.11";
        System.out.println(numberString);

        String lastString="10";
        int lastnum=10;
        lastString=lastString+lastnum;  // Merging of int and string is very easy
        System.out.println("The lastString is " + lastString);
        double doubleNumber=12.41d;
        lastString=lastString+doubleNumber;
        System.out.println("The lastString is " + lastString);

    }
}
