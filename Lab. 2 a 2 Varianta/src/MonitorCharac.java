public class MonitorCharac {
    private int Resolution;
    private double Dimension;
    private String Color;

    public MonitorCharac(int resolution, double dimension, String color) {
        this.Resolution = resolution;
        this.Dimension = dimension;
        this.Color = color;
    }

    public String Resol(MonitorCharac other){
        if(this.Resolution > other.Resolution){
            return "Rezolutia primului monitor este mai mare";
        }
        else if(this.Resolution < other.Resolution){
            return "Rezolutia celui deal doilea monitor este mai mare";
        }
        else return "Rezolutiile sunt egale";
    }

    public String Dimen(MonitorCharac other){
        if(this.Dimension> other.Dimension){
            return "Dimensiunea primului monitor este mai mare";
        }
        else if(this.Dimension < other.Dimension){
            return "Dimensiunea celui deal doilea monitor este mai mare";
        }
        else return "Dimensiunile sunt egale";
    }

    public String getColor() {
        return Color;
    }
}
