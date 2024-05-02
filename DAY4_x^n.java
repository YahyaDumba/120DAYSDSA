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
        int pownminus1=xpn(x,n-1);
        int ans = x * pownminus1;
        return ans;
    }
    public static void main(String[] args)
    {
            int x=2,n=5;
          int ans=  xpn(x,n);
            System.out.println(ans);
    }
}
