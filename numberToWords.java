public class numberToWords {
    
    public static void main(String[] args){
        int temp=getDigitCount(-12);
        System.out.println(temp);
        int temp2=reverse(100);
        System.out.println(temp2);
        numberToWord(10001);
    }
    public static int getDigitCount(int number){
        int count = 0;
        if(number < 0){
            return -1;
        }
        else if(number==0){
            return 1;
        }
        else{
            while(number!=0){
                count++;
                number=number/10;
            }
            return count;
        }
    }

    public static int reverse(int number){
        int reverseNumber=0;
        while(number!=0){
            int remainder = number%10;
            reverseNumber=(reverseNumber*10)+remainder;
            number=number/10;
        }
        return reverseNumber;
    }

    public static void numberToWord(int number){

        number=reverse(number);
        // System.out.println(number);
        if(number<0){
            System.out.println("Invalid Value");
        }
        else{
            while(number!=0){
                int remainder=number%10;
                switch(remainder){
                    case 0:
                    System.out.println("Zero");
                    break;
                    case 1:
                    System.out.println("One");
                    break;
                    case 2:
                    System.out.println("Two");
                    break;
                    case 3:
                    System.out.println("Three");
                    break;
                    case 4:
                    System.out.println("Four");
                    break;
                    case 5:
                    System.out.println("Five");
                    break;
                    case 6:
                    System.out.println("Six");
                    break;
                    case 7:
                    System.out.println("Seven");
                    break;
                    case 8:
                    System.out.println("Eight");
                    break;
                    case 9:
                    System.out.println("Nine");
                    break;
                }
                number=number/10;
            }
        }
    }
}
