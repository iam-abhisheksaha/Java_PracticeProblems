import java.util.Scanner;
public class ifAndElseHackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        // System.out.println(number);
        if(number%2==0){
            if(number>=2 && number<=5){
                System.out.println("Not Weird");
            }
            else if(number>=6 && number<=20){
                System.out.println("Weird");    
            }
            else{
                System.out.println("Not Weird");
            }
        }

        else{
            System.out.println("Weird");
        }
        scanner.close();
      }
    }

