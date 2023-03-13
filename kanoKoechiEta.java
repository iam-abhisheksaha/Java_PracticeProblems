
class circle{
    private double radius;
    private double diameter;
    // circle(int radius){
    //     this.radius = radius;
    // }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public double circleArea(){
        return 3.14*radius*radius;
    }

    public double circumference(){
        return diameter*3.14;
    }

}

public class kanoKoechiEta {
    
    public static void main(String[] args){

        // System.out.println("Starting");
        circle c1 = new circle();
        c1.setRadius(20.5);
        System.out.println(c1.circleArea());
        c1.setDiameter(10.5);
        System.out.println(c1.circumference());
    }
}
