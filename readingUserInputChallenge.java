import java.util.Scanner;
public class readingUserInputChallenge {
    
    public static void main(String[] args) {

        //Sum of 10 numbers and print there sum
        System.out.println("Enter 10 numbers:- ");
        Scanner scanner = new Scanner(System.in);
        int count=1;
        int sum=0;
        while(count <= 10){
            System.out.println("Enter Number "+count);
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt){
                int n = scanner.nextInt();
                sum+=n;
                count++;
            }
            else{
                System.out.println("Invalid Number ");
                scanner.nextLine();  // handle end of the line and allow the user to give input
            }
            
        }
        System.out.println("Sum of 10 numbers is "+sum);
        scanner.close();
    }
}
