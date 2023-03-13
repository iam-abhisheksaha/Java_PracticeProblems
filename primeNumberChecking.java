public class primeNumberChecking {
    
    public static void main(String[] args){

        int count=0;
        for (int j = 50; j<100;j++) {
            boolean temp=isPrimeNumber(j);
            if(temp==true) {
                System.out.println(j+" is a prime number");
                count++;
            }
            if(count==3){
                break;
            }

        }
    }
    public static boolean isPrimeNumber(int number){

        if(number==1){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
