
import java.util.Scanner;
public class Stringss{
    public static int partition(int arr[], int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void qsort(int arr[], int low, int high) {
    if(low<high)
    {
        int pivotx=partition(arr,low,high);
        qsort(arr,low,pivotx-1);
        qsort(arr,pivotx+1,high);
    }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int n=arr.length;
        System.out.println("Enter element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        qsort(arr,0,n-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}