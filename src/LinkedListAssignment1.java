
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedListAssignment1 {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
        List<Integer> hii = new LinkedList<>();
        for (Integer integer :list ){
           if (!hii.contains(integer)){
               hii.add(integer);
           }
        }
        return hii;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(16);
        list.add(21);
        list.add(15);
        list.add(10);
        list.add(16);
        list.add(16);
        list.add(41);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates");
        for (Integer value : updatedList) {
            System.out.print(value+" ");
        }
    }

}