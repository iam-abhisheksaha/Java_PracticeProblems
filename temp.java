// import java.util.Scanner;
public class temp {

    public static void main(String[] args) {
        int bucketCount =getBucketCount(-2.75,3.25,2.5,1);
        System.out.println(bucketCount);
        int bucketCount1 =getBucketCount(3.4,2.1,1.5);
        System.out.println(bucketCount1);
        int bucketCount2 =getBucketCount(3.26,0.75);
        System.out.println(bucketCount2);
        
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){

        if(width<=0.0 || height<=0.0 || areaPerBucket<=0.0 || extraBuckets<0){
            return -1;
        }
        else{
            double areaOfWall=width*height;
        double remainingAreaOfWall=Math.abs(areaOfWall-(areaPerBucket*extraBuckets));
        int count=0;
        double temp=0;
        while(true) {
            if(temp>=remainingAreaOfWall){
                break;
            }
            else{
                count++;
                temp=temp+areaPerBucket;
            }
        }
        return count;
        }
        
    }

    public static int getBucketCount(double width,double height,double areaPerBucket){

        if(width<=0.0 || height<=0.0 || areaPerBucket<=0.0){
            return -1;
        }
        else{
            double areaOfWall=width*height;
        double remainingAreaOfWall=(areaOfWall);
        int count=0;
        double temp=0;
        while(true) {
            if(temp>=remainingAreaOfWall){
                break;
            }
            else{
                count++;
                temp=temp+areaPerBucket;
            }
        }
        return count;
        }
        
    }

    public static int getBucketCount(double area,double areaPerBucket){

        if(area<=0.0 || areaPerBucket<0.0){
            return -1;
        }
        else{
            // double areaOfWall=area;
        double remainingAreaOfWall=area;
        int count=0;
        double temp=0;
        while(true) {
            if(temp>=remainingAreaOfWall){
                break;
            }
            else{
                count++;
                temp=temp+areaPerBucket;
            }
        }
        return count;
        }
        
    }
}

 
 

