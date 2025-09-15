import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class play {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        System.out.println(list);

        List<Integer> hii = new LinkedList<>();
         hii.add(list.get(0));

        System.out.println(hii);


    //********************************


        List<Integer> hiii = new LinkedList<>();
        for (int i = 0; i<list.size(); i++){
            hiii.add(list.get(i));

            System.out.println(hiii);

            for (int j = 0; j<list.size(); j++){
                if (Objects.equals(hiii.get(i), list.get(j))){
                    list.remove(j);
                }
                System.out.println(list);
            }
        }

        System.out.println(hiii);
    }
}
