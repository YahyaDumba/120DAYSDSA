import java.util.Scanner;
public class Stringss {
    public static void printNumber(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        printNumber(n+1);

    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       //System.out.println("Enter The Number according to your choice:-");
      // int n=sc.nextInt();
       printNumber(1);
    }
}
