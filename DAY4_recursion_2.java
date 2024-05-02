import java.util.Scanner;
public class Stringss {
    public static void sumNumber(int i,int n,int sum)
    {
            if(i==n)
            {
                sum+=i;
                System.out.println(sum);
                return;
            }
            sum+=i;
            sumNumber(i+1,n,sum);

    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Value of n:-");
     int n=sc.nextInt();
int sum=0;
int i=1;
sumNumber(i,n,sum);
    }
}
