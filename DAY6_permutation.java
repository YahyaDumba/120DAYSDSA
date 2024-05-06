import java.util.HashSet;
public class Stringss{
public static void printPermutation(String str,String permutation)
{
    if(str.length()==0)
    {
        System.out.println(permutation);
        return;
    }
    for(int i=0;i<str.length();i++)

    {
        char currchar=str.charAt(i);
        String newstring=str.substring(0,i)+str.substring(i+1);
        printPermutation(newstring,permutation+currchar);
    }


}
    public static void main(String[] args)
    {
        String str="def";
        printPermutation(str,"");
    }

}