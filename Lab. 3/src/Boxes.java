public class Boxes {

    private double height;
    private double width;
    private double depth;

    public Boxes() {
        this(1,1,1);
    }

    public Boxes(double height) {
        this(height, height, height);
    }

    public Boxes(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getAria(){
        return 2*(this.height*this.width+ this.height*this.depth+ this.depth*this.width);
    }

    public double getVolume(){
        return this.depth*this.width*this.height;
    }

}
