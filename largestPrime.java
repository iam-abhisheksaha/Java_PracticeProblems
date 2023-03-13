public class largestPrime {
    
    public static void main(String[] args) {
        
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number){

        int largestPrime =-1;

        if(number<0){
            return largestPrime;
        }
        else{
            while(number%2==0){
                largestPrime=2;
                number>>=1;
            }
            for(int i=3;i<=Math.sqrt(number);i += 2){
                while(number%i==0){
                    largestPrime=i;
                    number=number/i;
                }
            }
    
            if(number>2){
                largestPrime=number;
            }
            // System.out.println(number);
            return largestPrime;
        }
        }
}
