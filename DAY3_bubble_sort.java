import java.util.Scanner;

public class Main {
    public  static void printarray(int array[]){
       for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("Bubble Sort Program");
     System.out.println("Enter The Size of  Array:-");
     int value=sc.nextInt();// to let the user enter size of an array
     int[]  array=new int[value];
        System.out.println("Enter the elements of the Array:-");
for(int i=0;i<array.length;i++)// to let the user enter the elements in an array
{

    array[i]=sc.nextInt();
}
     for(int i=0;i<array.length-1;i++)
     {
         for(int j=0;j<array.length-i-1;j++)
         {
            if(array[j]>array[j+1])
            {
                int temp =array[j];
                array[j]=array[j+1];
                array[j+1]=temp;

            }
         }
     }
    printarray(array);
    }
}