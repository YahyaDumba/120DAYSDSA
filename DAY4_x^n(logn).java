import java.util.Scanner;

public class Stringss {
    public static int xpn(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
       if(n%2==0)
       {
           return xpn(x,n/2) * xpn(x,n/2);
       }
       else {
            return xpn(x,n/2) * xpn(x,n/2) * x;
       }
    }
    public static void main(String[] args)
    {
            int x=2,n=5;
          int ans=  xpn(x,n);
            System.out.println(ans);
    }
}
