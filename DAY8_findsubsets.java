import java.util.ArrayList;
import java.util.HashSet;
public class Stringss{
    public static void printSubset(ArrayList<Integer> subset)
    {
        for (int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");

        }
        System.out.println();
    }
public static void subsets(int n, ArrayList<Integer> subset){
if(n==0)
{
    printSubset(subset);
    return;
}
    subset.add(n);
subsets(n-1,subset);

subset.remove(subset.size()-1);
subsets(n-1,subset);
}
    public static void main(String[] args)
    {
       int n=4;
       ArrayList<Integer> subset=new ArrayList<>();
       subsets(n,subset);
    }

}