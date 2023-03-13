public class secAndMinChallenge {
    
    public static void main(String[] args){


        String temp=getDuration(100,74);
        System.out.println(temp);

        temp=getDuration(1000);
        System.out.println(temp);

        // getDuration(1000);
    }
    public static String getDuration(int minutes,int seconds) {

        if(minutes<0 || (seconds<0 && seconds>60)){
            return "Invalid Value";
        }
        int hours=(int)minutes/60;
        int remainingMinutes=(int)minutes%60;
        remainingMinutes+= (int)seconds/60;
        int newSecond=(int)seconds%60;
        // System.out.println("Hours = " + hours + " Minutes = "+remainingMinutes);
        return hours+"h "+remainingMinutes+ "m "+ newSecond+"s";
    }

    public static String getDuration(int seconds){

        int newMinutes=(int)seconds/60;
        int remainingSeconds=(int)seconds%60;

        return getDuration(newMinutes,remainingSeconds);
    }
}
