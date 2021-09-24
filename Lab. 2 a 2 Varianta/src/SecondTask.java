import java.util.Arrays;

public class SecondTask {

    private String UnName;
    private int UnFoundY;
    private Studenti s[];

    public SecondTask(String unName, int unFoundY, Studenti[] s) {
        UnName = unName;
        UnFoundY = unFoundY;
        this.s = s;
    }

    public String getUnName() {
        return UnName;
    }

    public int getUnFoundY() {
        return UnFoundY;
    }

    public Studenti[] getS() {
        return s;
    }

    /* for second task
    @Override
    public String toString() {
        return Arrays.toString(s);
    }*/

    @Override
    public String toString() {
        return Arrays.toString(s);
    }
}
