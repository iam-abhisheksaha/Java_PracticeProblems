public class flourPackProblem {
    // write your code here
    public static void main(String[] args){
       boolean temp= canPack(2,1,5);
       System.out.println(temp);
    }
    
    public static boolean canPack(int bigCount,int smallCount,int goal){
        
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        else{
            int achieveGoal=0;
            while(bigCount!=0){
            achieveGoal+=5;
            bigCount-=1;
            if(Math.abs(achieveGoal-goal)>=5){
                continue;
            }
            else{
                break;
            }
           }
           
           if(achieveGoal==goal){
               return true;
           }
           else{
            while(smallCount!=0){
                achieveGoal+=1;
                smallCount-=1;
                if(Math.abs(achieveGoal-goal)>=1){
                    continue;
                }
                else{
                    break;
                }
              }
            // System.out.println(achieveGoal);
            // return true;
            if(achieveGoal==goal){
                return true;
            }
            else{
                return false;
            }
           }
        }
    }
}