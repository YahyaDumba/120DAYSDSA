import javax.swing.*;
import java.util.*;
public class Stringss {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number of your choice");
       int input=sc.nextInt();
       int input2=input;
       String result="";
      int remainder=0;
     while(input2>0)
     {
         remainder=input2 % 2;
          input2=input2/2;
          result = remainder + result;

     }
     System.out.println(result);
    }

}
