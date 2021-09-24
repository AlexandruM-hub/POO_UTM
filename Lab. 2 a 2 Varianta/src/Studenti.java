public class Studenti {
    private String StName;
    private int StAge;
    private double StMark;

    public Studenti(String stName, int stAge, double stMark) {
        StName = stName;
        StAge = stAge;
        StMark = stMark;
    }

    public String getStName() {
        return StName;
    }

    public void setStName(String stName) {
        StName = stName;
    }

    public int getStAge() {
        return StAge;
    }

    public void setStAge(int stAge) {
        StAge = stAge;
    }

    public double getStMark() {
        return StMark;
    }

    public void setStMark(double stMark) {
        StMark = stMark;
    }

    /* for second task
    @Override
    public String toString() {
        return StName;
    }*/

    @Override
    public String toString() {
        return ""+StMark;
    }
}
