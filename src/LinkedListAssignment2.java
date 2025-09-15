
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedListAssignment2 {

    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        //Implement your logic here and change the return statement accordingly
        List<Integer> hello = new LinkedList<>();

        for (Integer p : listOne ){
            if (listTwo.contains(p) && !hello.contains(p)){
                hello.add(p);
            }


//            for (Integer k : listTwo){
//                if (Objects.equals(p, k)){
//                    hello.add(p);
//                }
//            }
        }
        return hello;
    }

    public static void main(String arga[]){

        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(101);
        listOne.add(211);
        listOne.add(10);
        listOne.add(8);
        listOne.add(53);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(101);
        listTwo.add(211);
        listTwo.add(5);
        listTwo.add(8);
        listTwo.add(53);

        System.out.println(findCommonElements(listOne, listTwo));
    }
}