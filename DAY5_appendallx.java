import java.util.Scanner;

public class Stringss {
    public static int first=-1;
    public static int last=-1;
   public static void appendallx(String str,int index,int count,String newString)
   {
       if(index==str.length())
       {
           for(int i=0;i<count;i++)
           {
               newString+='x';
           }
           System.out.println(newString);
           return;
       }
       char currCharacter=str.charAt(index);
       if(currCharacter=='x')
       {
           count++;
           appendallx(str,index+1,count,newString);
       }
       else {
           newString+=currCharacter;
           appendallx(str,index+1,count,newString);
       }
   }
    public static void main(String[] args)
    {
        String str="axbcxxd";
        appendallx(str,0,0,"");
    }
}
