public class switchStatementChallenge {
    
    // private static final char[] Jan = null;

    public static void main(String[] args){

        char alphabet='R';
        switch(alphabet) {

            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month="January";

        switch(month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
        }
    }
}
