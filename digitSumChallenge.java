public class digitSumChallenge {
    
    public static void main(String[] args){

        int temp=sumDigits(7454);
        System.out.println(temp);
    }

    public static int sumDigits(int number){

        int sum=0;
        if(number<0){
            return -1;
        }
        else{
            while(number!=0){
                int remainder=number%10;
                sum+=remainder;
                number=number/10;
            }
            return sum;
        }
    }
}
