public class greatestCommonDivisor {
    public static void main(String[] args) {
        boolean temp=isPerfectNumber(6);
        System.out.println(temp);
    }

    public static boolean isPerfectNumber(int number){
        int sum=0;
        if(number<1){
            return false;
        }
        else{
            for(int i=1;i<number;i++){
                if(number%i==0){
                    sum+=i;
                }
            }
            System.out.println(sum);
            if(sum==number){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
