import java.util.Scanner;

public class Stringss {
    public static int first=-1;
    public static int last=-1;
   public static void findOccurance(String str,int index,int element)
   {
       if(index==str.length())
       {
           System.out.println(first);
           System.out.println(last);
           return;
       }
      char currentCharacter=str.charAt(index);
      if(currentCharacter==element)
      {
          if(first == -1)
          {
                first=index;
          }
          else {
              last=index;
          }

      }
       findOccurance(str,index+1,element);
   }
    public static void main(String[] args)
    {
            findOccurance("abaabeaseaaf",0,'a');
    }
}
