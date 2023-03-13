import java.util.Scanner;
public class readingUserInput2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int birthYear=0;
        while(true){
            System.out.println("Enter your Birth Year:- ");
            boolean hasNextInt= scanner.hasNextInt();
            if(hasNextInt){
                birthYear = scanner.nextInt();
                if(birthYear<0){
                    System.out.println("Negative Birth Year");
                    continue;
                }
                else{
                    break;
                }
            }
            else{
                System.out.println("Birth is not an Integer");
                break;
            }
        }
        System.out.println("Age of the user is: " + (2021-birthYear));
        // System.out.println(birthYear);
        scanner.close();
    }
}
