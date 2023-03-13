public class operatorsChallenge {
    
    public static void main(String[] args){

        double variable1=20.00d;
        double variable2=80.00d;

        double finalVariable=(variable2+variable1)*100.00d;
        System.out.println("My final varibles: " + finalVariable);
        double remainderVariable=finalVariable % 40.00d;
        System.out.println("The remainder variable: " + remainderVariable);
        boolean assignVariable;
        if(remainderVariable==0){
            assignVariable=true;
        }
        else{
            assignVariable=false;
        }
        System.out.println("isReaminder: " + assignVariable);
        if(!assignVariable){
            System.out.println(("Got some remainder"));
        }

    }
}
