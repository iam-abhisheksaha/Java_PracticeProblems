import java.util.Scanner;

public class readingUserInput {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthDate:- ");
        int yearOfBirth=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name:- ");
        String name = scanner.next();

        int age=2021-yearOfBirth;

        scanner.close();
        System.out.println("The name of the user is "+ name);
        System.out.println("The age of the user is "+ age);



    }
}
