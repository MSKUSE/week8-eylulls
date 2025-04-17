import java.util.Objects;

public class rectangle extends Shape {
    private int sideA = 0,sideB = 0;

    public rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        System.out.println("side a is"+sideA+this.sideA+"side b is"+this.sideB);
        super.describe();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        rectangle rectangle = (rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        if (this.sideA == r.sideA && this.sideB == r.sideB && this.getColor().equals(r.getColor())  {
            return true;
        }
        else{
            return false;
        }


    }
}
