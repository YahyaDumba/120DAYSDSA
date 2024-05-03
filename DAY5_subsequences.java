import java.util.Scanner;

public class Stringss {
public static boolean [] map=new boolean[26];
public static void subsequences(String str,int index, String newString)
{
    if(index==str.length())
    {
        System.out.println(newString);
        return;
    }
    char currelement=str.charAt(index);
    subsequences(str,index+1,newString+currelement);
    subsequences(str,index+1,newString);
}


    public static void main(String[] args)
    {
        String str="abc";
        subsequences(str,0,"");
    }
}
