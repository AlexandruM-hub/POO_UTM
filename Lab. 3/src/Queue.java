import java.util.Iterator;
import java.util.LinkedList;

public class Queue {

    private int NumberOfElements;
    private LinkedList <String> Q;

    public Queue(int numberOfElements, LinkedList<String> queue) {
        this.NumberOfElements = numberOfElements;
        this.Q = queue;
    }

    public Queue() {
        this(Integer.MAX_VALUE,new LinkedList<String>());
    }

    public int getNumberOfElements() {
        return NumberOfElements;
    }

    public LinkedList<String> getQ() {
        return Q;
    }

    public void Qpush (Queue Coada, String toAdd){
        int a = this.NumberOfElements;
        if(a > Coada.Q.size()){
            Coada.Q.add(0,toAdd);
            System.out.println("Elementul a fost adaugat!");
        }
        else{
            System.out.println("Coada este plina!!!");
        }
    }

    public void printQue(Queue coada){
        if(coada.Q.isEmpty()){
            System.out.println("Coada este goala!");
        }
        else{
            Iterator <String> iterator = coada.Q.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    public void Qremove(Queue coada){
        if(coada.Q.isEmpty()){
            System.out.println("Coada este goala!");
        }
        else {
            coada.Q.removeLast();
            System.out.println("Ultimul element a fost sters cu succes!");
        }
    }

    public void checkEmpty(Queue coada){
        if(coada.Q.isEmpty() && this.NumberOfElements == Integer.MAX_VALUE){
            System.out.println("Coada niciodata nu va fi plina");
        }
        else if(this.NumberOfElements == coada.Q.size()){
            System.out.println("Coada este plina");
        }
        else {
            System.out.println("In coada sunt "+ coada.Q.size() + " elemente");
            System.out.println("Spatii disponibile = "+ this.NumberOfElements);
            int a = this.NumberOfElements;
            System.out.println("Au mai ramas = " +(a-coada.Q.size()));
        }
    }

}
