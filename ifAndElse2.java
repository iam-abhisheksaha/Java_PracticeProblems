public class ifAndElse2 {
    
    public static void main(String[] args){

        boolean gameOver=true;
        int levelCompleted=5;
        int score=4000;
        int bonus=100;

        if(score==5000){
            System.out.println("Your Score is 5000!");
        }
        else if(score>5000){
            System.out.println("Your Score is greater than 5000!");
        }
        else{
            System.out.println("Your Score is less than 5000!");
        }
        System.out.println("Out of if and else statement");
        if(gameOver==true){  
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("The final Score is " + finalScore);
        }

        score=10000;
        levelCompleted=8;
        bonus=200;
        int secondfinalScore=score+(levelCompleted*bonus);
        System.out.println("The second final Score is " + secondfinalScore);
    }
}
