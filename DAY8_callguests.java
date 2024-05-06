import java.util.HashSet;
public class Stringss{
public static int guests(int n)
{
        if(n<=1)
        {
            return 1;
        }
        int way1=guests(n-1);
        int way2=(n-1) * guests(n-2);

        return way1+way2;

}
    public static void main(String[] args)
    {
       int n=5;
       System.out.println(guests(n));
    }

}