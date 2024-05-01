import javax.swing.*;
import java.util.*;
public class Stringss {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number of your choice");
       int input=sc.nextInt();
       String binary=Integer.toBinaryString(input);
      int count=0;
      for(int i=0;i<binary.length();i++)
      {
            if(binary.charAt(i)=='1')
            {
                count++;
            }
      }
      System.out.println(binary);
      System.out.println("Number of 1's present in the number you entered is:-"+count);
    }
}
