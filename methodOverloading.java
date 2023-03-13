public class methodOverloading {
    
    public static void main(String[] args){
       int newScore= calculateScore("Abhi",500);
       System.out.println("New Score: " + newScore);
       calculateScore("Abhi",500,2);

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " score: " + score);
        return score*10;
    }

    public static int calculateScore(String playerName, int score, int ranking){
        System.out.println("Player "+ playerName + " score: " + score + " ranking: " + ranking);
        return score*10;
    }
}
