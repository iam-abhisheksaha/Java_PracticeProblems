// import java.net.SocketImpl;

public class methodsChallenge {
    
    public static void main(String[] args){

        
        int ranking=calculateHighScorePosition(1500);
        displayHighScorePositions("Abhishek", ranking);


        ranking=calculateHighScorePosition(900);
        displayHighScorePositions("Samrat", ranking);


        ranking=calculateHighScorePosition(400);
        displayHighScorePositions("Maderchod", ranking);

        ranking=calculateHighScorePosition(50);
        displayHighScorePositions("Laura", ranking);

        ranking=calculateHighScorePosition(500);
        displayHighScorePositions("Chutiya", ranking);

    }
    public static void displayHighScorePositions(String playerName,int position){
        System.out.println(playerName+" manage to get into position "+ position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore>1000){
            return 1;
        }
        else if(playerScore>500 && playerScore<=1000){
            return 2;
        }
        else if(playerScore>100 && playerScore<=500){
            return 3;
        }
        return 4;
    }
}
