package carpet;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length){
        this.length = (length < 0) ? 0 : length;
        this.width = (width >= 0) ? width : 0;
    }

    public double getArea(){
        return (width * length);
    }

}
