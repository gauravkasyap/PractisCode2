
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListExersi1 {
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
        //Implement your logic here and change the return statement accordingly
        List<Object> hii = new LinkedList<Object>();
        hii.addAll(listOne);
       // hii.addAll(listTwo.reversed());

        //or another answer

        Iterator<Object> it = ((LinkedList<Object>) listTwo).descendingIterator();
        while (it.hasNext()){
            hii.add(it.next());
        }

        return hii;
    }


    public static void main(String args[]) {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);

        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");

        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");
        for (Object value : concatenatedList) {
            System.out.print(value+" -> ");
        }
    }
}
