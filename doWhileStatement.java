public class doWhileStatement {
    
    public static void main(String[] args){

        // int count=1;
        // while(count!=5){
        //     System.out.println("Count value: "+ count);
        //     count++;
        // }

        // count = 1;
        // do{
        //     System.out.println("Count value: "+ count);
        //     count++;
        // }while(count!=5);

        int number=50;
        int count=0;
        while(number!=100){
            if(isEvenNumber(number)){
                System.out.println("Even number: "+number);
                count++;
                number++;
            }

            if(count==5){
                break;
            }
            number++;
        }
        System.out.println("Total Even numbers are found: "+count);
    }

    public static boolean isEvenNumber(int number){

        if(number%2==0 && number>0){
            return true;
        }
        return false;
    }
}
