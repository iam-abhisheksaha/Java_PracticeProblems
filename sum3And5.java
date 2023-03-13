public class sum3And5 {
    
    public static void main(String[] args){
        int sum=0;
        int count=0;

        for (int i =1;i<=1000;i++) {
            
            if(i%3==0 && i%5==0) {
                System.out.println("The Number which met the condition is " + i);
                sum+=i;
                count++;
            }
            if(count>=5){
                break;
            }
        }

        System.out.println("The Sum of first 5 elements is " + sum);
    }
}
