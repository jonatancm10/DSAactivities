package upc;

public class triangle implements Figure{

    private double h;
    private double b;

    public triangle (double h, double b){

        this.b = b;
        this.h = h;
    }
    public double area(){
        return b * h / 2;
    }
    public String type() {
        return "triangle";
    }
}
