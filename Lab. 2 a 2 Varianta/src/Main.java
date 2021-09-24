public class Main {
    public static void Average(String std){
        double count = 0;
        std = std.substring(1, std.length()-1);
        String[] tokens = std.split("[,]");
        for (int i =0; i<3; i++){
            tokens[i]= tokens[i].trim();
            count+= Double.parseDouble(tokens[i]);
        }
        System.out.println(count/3);

        /*for (String i : std){
            count+=Double.valueOf(i).doubleValue();
        }
        System.out.println("Average== "+ count/std.length());*/
    }
    public static void main(String[] args){
        /************* Second Task ***********/

        Studenti[] stds = {new Studenti("Sandu", 21, 9.9), new Studenti("Vasile", 21, 9.2), new Studenti("Vova", 21, 8.2)};
        SecondTask FirstUniv = new SecondTask("UTM", 1988, stds);
        //System.out.println(FirstUniv.toString());

        /************ Thrd Task **************/
        Studenti[] b = {new Studenti("Ion", 21, 9.2), new Studenti("Vasile", 21, 7), new Studenti("Vova", 21, 5.4)};
        SecondTask SecondUniv = new SecondTask("ULIM", 1988, b);


        Studenti[] c = {new Studenti("Sandu", 21, 10), new Studenti("Vasile", 21, 7.2), new Studenti("Vova", 21, 4)};
        SecondTask ThrdUniv = new SecondTask("UTM", 1988, c);

        System.out.println("Media pentru prima universitate: ");
        Average(FirstUniv.toString());
        System.out.println("Media pentru a 2 universitate: ");
        Average(SecondUniv.toString());
        System.out.println("Media pentru a treia universitate: ");
        Average(ThrdUniv.toString());



    }

}
