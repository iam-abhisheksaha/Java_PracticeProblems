public class ifAndElse {
    
    public static void main(String[] args){

        boolean isAlien=false;
        if(isAlien==false)
            System.out.println("It's not a alien");
        else{
            System.out.println("It's a alien");
        }

        int num=11;
        if(num%2==0){
            System.out.println("The number is even");
        }
        else if(num>=11){
            System.out.println("Its Equal");
        }
        else{
            System.out.println("The number is odd");
        }

        int topScore=95;
        int secondScore=75;
        if((topScore>secondScore) && (topScore<100)){ // logical AND operator
            System.out.println("Top-Score is greatest and less than 100");
        }
        if((topScore>90) || (secondScore<=90)){
            System.out.println("Either both of the condition is true");
        }


    }
}
