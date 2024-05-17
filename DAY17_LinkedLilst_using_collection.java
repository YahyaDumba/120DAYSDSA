import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LList {

    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<String>();
        list.addFirst("Dumba");
        list.addFirst("Yahya");
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("!!");
        list.removeLast();
        System.out.println(list);
        System.out.println("Size of LinkedList is:-"+list.size());
        String value="Yahya";
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");

    }
}