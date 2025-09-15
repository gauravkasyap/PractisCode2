import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class tester {
    public static void main(String[] args) {

        List<Integer> hii = new ArrayList<>();
        hii.add(4);
        hii.add(5);
        hii.add(6);
        hii.add(7);

        ListIterator<Integer> heoo= hii.listIterator();

        System.out.println("displyingn num....");
        while (heoo.hasNext()){
            System.out.println(heoo.next());
        }

        System.out.println("Display numbers in the reverse order");
        while (heoo.hasPrevious()){
            System.out.println(heoo.previous());
        }
    }
}
