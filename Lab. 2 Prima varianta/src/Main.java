import java.util.ArrayList;

public class Main {
    public static void Average(ArrayList<Object> obj) {
        ArrayList stdunt = obj;
        Object[] arr = stdunt.toArray();
        double count = 0;

        for (Object ar : arr) {
            String a = ar.toString();
            double d = Double.valueOf(a).doubleValue();
            count += d;
        }
        System.out.println("Average: " + count/3);
    }

    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti datele despre primul monitor:");
        System.out.println("Rezolutia: ");
        int dimen = sc.nextInt();
        System.out.println("Dimenisunea:");
        double size = sc.nextDouble();
        System.out.println("Culoarea:");
        String Color = sc.next();
        MonitorCharac FirstMonit = new MonitorCharac(dimen, size, Color);

        System.out.println("Introduceti datele despre al doilea monitor:");
        System.out.println("Rezolutia: ");
        dimen = sc.nextInt();
        System.out.println("Dimenisunea:");
        size = sc.nextDouble();
        System.out.println("Culoarea:");
        Color = sc.next();
        sc.close();
        MonitorCharac SecondMonit = new MonitorCharac(dimen, size, Color);

        System.out.println(FirstMonit.Resol(SecondMonit));
        System.out.println(FirstMonit.Dimen(SecondMonit));
        System.out.println("Culoarea primului monitor este:");
        System.out.println(FirstMonit.getColor());
        System.out.println("Culoarea celui de-al doilea monitor este:");
        System.out.println(SecondMonit.getColor());
        /***********************************************************/

        SecondTask Fst = new SecondTask("Sandu", 21, 9.9);
        SecondTask SecSt = new SecondTask("Ion", 22, 8.9);
        SecondTask ThrSt = new SecondTask("Vasile", 21, 8.5);
        ArrayList FirstU = new ArrayList<Object>();
        FirstU.add(Fst);
        FirstU.add(SecSt);
        FirstU.add(ThrSt);

        SecondTask FirstUniv = new SecondTask("UTM", 1988, FirstU );
        System.out.println(FirstUniv.getUnFoundY());
        System.out.println(FirstUniv.getUnName());
        System.out.println(FirstUniv.getStudents());

        /*SecondTask asd= (SecondTask) FirstUniv.getStudents().get(0);
        for (Object a:FirstUniv.getStudents()) {

            ((SecondTask) a).ge

        }*/


        /***********************************************/
        SecondTask st1 = new SecondTask("Alex", 21, 9.2);
        SecondTask st2 = new SecondTask("Vladimir", 22, 8.9);
        SecondTask st3 = new SecondTask("Ioana", 21, 8.0);
        ArrayList ScdUn = new ArrayList<Object>();
        ScdUn.add(st1);
        ScdUn.add(st2);
        ScdUn.add(st3);
        SecondTask SecondUniv = new SecondTask("ULIM", 1990, ScdUn);

        SecondTask std1 = new SecondTask("Vasilisa", 21, 7.4);
        SecondTask std2 = new SecondTask("Cleopatra", 22, 8.7);
        SecondTask std3 = new SecondTask("Cristian", 21, 8.3);
        ArrayList ThrUn = new ArrayList<Object>();
        ThrUn.add(std1);
        ThrUn.add(std2);
        ThrUn.add(std3);
        SecondTask ThrdUniv = new SecondTask("ASEM", 1990, ThrUn);


        System.out.println("Media pentru UTM:");
        Average(FirstUniv.getStudents());
        System.out.println("Media pentru ULIM:");
        Average(SecondUniv.getStudents());
        System.out.println("Media pentru ASEM:");
        Average(ThrdUniv.getStudents());


        /**********************************************************/

    }


}
