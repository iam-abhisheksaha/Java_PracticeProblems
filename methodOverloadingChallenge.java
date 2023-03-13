public class methodOverloadingChallenge {
    
    public static void main(String[] args){

        double temp=calcFeetAndInchesToCentimeters(6,0);
        System.out.println(temp);

        calcFeetAndInchesToCentimeters(200);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet<0 || (inches<0 && inches>12)){
            return -1;
        }
        else{
            double centimeters = (inches*2.54)+(feet*30.48);
            System.out.println(feet+"feet, " + inches + " inches, " + centimeters + "centimeters, ");
            return centimeters;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches < 0){
            return -1;
        }
        double feet=(int)inches/12;
        double remainingInches=(int)feet%12;
        System.out.println("feet="+feet+" remainingInches"+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }



}
