public class Shape {
    private String color = "white";
    public Shape(){

    }
    public Shape(String color){
        this.color = color;
    }
    private double area(){
        return 0.0;
    }
    public double perimeter(){
        return 0.0;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void describe(int sideA , int sideB){
        System.out.println("side A is "+sideA+" side b is "+sideB");
    }
    public void describe(int sideA){
        System.out.println("side A is"+sideA);
    }
    public void describe(double sideA){
        System.out.println("Radius is"+sideA);
    }
    public void describe(){
        System.out.println("this is a shape and color is"+this.color);
    }
}
