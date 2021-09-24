import java.util.ArrayList;

public class SecondTask {
    private String StName;
    private int StAge;
    private double StMark;

    private String UnName;
    private int UnFoundY;
    private ArrayList<Object> Students;


    public SecondTask(String stName, int stAge, double stMark) {
        this.StName = stName;
        this.StAge = stAge;
        this.StMark = stMark;
    }

    public SecondTask(String unName, int unFoundY, ArrayList<Object> Students) {
        this.UnName = unName;
        this.UnFoundY = unFoundY;
        this.Students = Students;
    }

    public int getUnFoundY() {
        return UnFoundY;
    }

    public ArrayList<Object> getStudents() {
        return Students;
    }

   /*public String toString(){
        return StName;
    }*/

    public String getUnName() {
        return UnName;
    }

    public String toString(){
        return "" +StMark;
    }



}
