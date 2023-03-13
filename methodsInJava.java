public class methodsInJava {
    
    public static void main(String[] args){
            boolean gameOver=true;
            int levelCompleted=5;
            int score=4000;
            int bonus=100;
            int highscore=calculateScore(gameOver, levelCompleted, score, bonus);
            System.out.println("The final Score is " + highscore);


            levelCompleted=8;
            score=10000;
            bonus=100;
            highscore=calculateScore(gameOver, levelCompleted, score, bonus);
            System.out.println("The final Score is " + highscore);
    }

    public static int calculateScore(boolean gameOver,int levelCompleted,int score, int bonus){

            if(gameOver==true){  
                int finalScore=score+(levelCompleted*bonus);
                return finalScore;
            }
                return -1;
    }
}
