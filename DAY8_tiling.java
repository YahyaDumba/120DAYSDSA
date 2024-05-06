import java.util.HashSet;
public class Stringss{
public static int placetiles(int n,int m)
{

    if (n==m)
    {
        return 2;

    }
    if(n<m)
    {
        return 1;
    }
    int vert = placetiles(n - m, m);
            int hori=placetiles(n-1,m);

            return vert+hori;


}
    public static void main(String[] args)
    {
        int n=4,m=2;
int result=        placetiles(n,m);
    System.out.println(result);
    }

}