import java.util.Scanner;
public class minAndMax {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int minNumber=0;
        int maxNumber=0;
        boolean First = true;
        System.out.println("Enter Number ");
        System.out.println("If, you want to break out of the loop ");
        System.out.println("Enter anything except numbers");
        while(true){
            System.out.println("Enter Number ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(First){
                    minNumber=number;
                    maxNumber=number;
                    First=false;
                }
                if(number>maxNumber){
                    maxNumber = number;
                }
                if(number<minNumber){
                    minNumber=number;
                }
            }
            else{
                break;
            }

        }
        System.out.println("Max number is "+ maxNumber);
        System.out.println("Min number is "+minNumber);
        scanner.close();
    }
}
