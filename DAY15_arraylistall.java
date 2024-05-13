
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Stringss{
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(9);
        l.add(5);
        l.add(7);
        System.out.println(l);
        int element = l.get(1);
        System.out.println(element);
        l.add(1,4);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
        l.set(1,3);
        System.out.println(l);
        System.out.println(l.size());
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        Collections.sort(l);
        System.out.println(l);
    }
}