import java.util.Scanner;

public class Stringss {
public static boolean [] map=new boolean[26];
public static void remDuplicates (String str,int index,String newString)
{
    if(index==str.length())
    {
        System.out.println(newString);
        return;
    }
    char currchar=str.charAt(index);
    if(map[currchar - 'a']){
        remDuplicates(str,index+1,newString);

    }
    else {
        newString+=currchar;
        map[currchar-'a']=true;
        remDuplicates(str,index+1,newString);
    }
}

    public static void main(String[] args)
    {
       String str="abbccda";
       remDuplicates(str,0,"");
    }
}
