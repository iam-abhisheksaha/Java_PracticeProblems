public class forStatement {
    
    public static void main(String[] args){

        // double temp=calculateInterest(10000,2);
        // System.out.println(temp);

        for (int i=2;i<=8;i++) {
            double temp=calculateInterest(10000,i);
            System.out.println("10000 at " + i+ "% interest = " + temp);
        }
        System.out.println("\n");
        //Reverse Loop
        for (int i=8;i>=2;i--) {
            double temp=calculateInterest(10000,i);
            System.out.println("10000 at " + i+ "% interest = " + temp);
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return ((interestRate/100) * amount);
    }
}
