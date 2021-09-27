import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void Menu(){
        Queue Que = new Queue(3,new LinkedList<String>());
        System.out.println("Alegeti optiunea dorita: ");
        System.out.println("0. Iesire din program");
        System.out.println("1. Adaugarea unui noi obiect in lista");
        System.out.println("2. Stergerea unui element din lista");
        System.out.println("3. Printarea obiectelor");
        System.out.println("4. Verificare stare coada");
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        while (!quit){
            int alegere = scan.nextInt();
            scan.nextLine();
            switch (alegere){
                case 0:{
                    System.out.println("Iesire din program !");
                    quit = true;
                    break;
                }
                case 1:{
                    Que.Qpush(Que,"Yey");
                    break;
                }
                case 2:{
                    Que.Qremove(Que);
                    break;
                }
                case 3:{
                    Que.printQue(Que);
                    break;
                }
                case 4:{
                    Que.checkEmpty(Que);
                    break;
                }
                default:{
                    System.out.println("Valoare incorecta! Alegei inca odata");
                    Menu();
                    break;
                }
            }
        }
    }



    public static void main(String[] args){
        /**** Primul task *********/

        Boxes FirstBox = new Boxes();
        Boxes SecondBox = new Boxes(2);
        Boxes ThrdBox = new Boxes(1,2,3);
        System.out.println(SecondBox.getDepth());
        System.out.println("Volum = "+ ThrdBox.getVolume());
        System.out.println("Aria = "+ ThrdBox.getAria());
        Menu();

    }
}
