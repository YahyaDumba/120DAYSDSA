import java.util.Scanner;

public class Stringss {
   public static void towerOfHanoi(int n,String src,String Helper, String Destination)
   {
       if(n==1)
       {
           System.out.println("Disk Transferred from "+src+" to "+Destination);
           return;
       }
       towerOfHanoi(n-1,src,Destination,Helper);
       System.out.println("Disk Transferred from "+src+" to "+Destination);
       towerOfHanoi(n-1,Helper,src,Destination);
   }
    public static void main(String[] args)
    {
            int n=2;
            towerOfHanoi(n,"Source","Helperr","Destinationn");
    }
}
