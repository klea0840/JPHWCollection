import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task2 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

