import javax.swing.*;
import java.util.*;
public class Stringss {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);

        }
    }
    public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);
       //System.out.println("Enter a number of your choice");
        int arr[]={7,8,3,1,2};
        System.out.println("Time Complexity of this code is O(n^2)");
        for(int i=0;i<arr.length;i++)
        {
            int smallest =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                    //swap

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printarray(arr);
    }
}
