package upc;

public class circle implements Figure{

    double r;

    public circle (double r){

        this.r = r;
    }
    public double area (){
        return r * r * Math.PI;
    }
    public String type(){
        return "circle";
    }
}
