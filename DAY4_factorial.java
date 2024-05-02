import java.util.Scanner;
public class Stringss {
    public static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
int factnminus1 = factorial(n-1);
int facto=n*factnminus1;
return facto;
    }
    public static void main(String[] args) {
int n=5;
int ans=factorial(n);
System.out.println(ans);
    }
}
