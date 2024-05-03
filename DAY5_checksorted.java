import java.util.Scanner;

public class Stringss {
    public static int first=-1;
    public static int last=-1;
   public static boolean checksorted(int array[],int index)
   {
       if(index==array.length-1)
       {
           return true;
       }
            if(array[index]<array[index+1])
            {
                return checksorted(array,index+1);
            }
            else {
                return false;
            }
   }
    public static void main(String[] args)
    {
        int [] array={1,2,8,4,5};
           System.out.println(checksorted(array,0));
    }
}
