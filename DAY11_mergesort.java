
import java.util.Scanner;
public class Stringss{
    public static void conquer(int arr[], int si, int mid, int ei) {
        int mergedarray[] = new int[ei - si + 1];
        int index1 = si; //track 1st array
        int index2 = mid + 1;//track 2nd array
        int x = 0;//track mergedarray
        while (index1 <= mid && index2 <=    ei) {
            if (arr[index1] <= arr[index2]) {
                mergedarray[x++] = arr[index1++];
            } else {
                mergedarray[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            mergedarray[x++] = arr[index1++];
        }
        while ((index2 <= ei)) {
            mergedarray[x++] = arr[index2++];
        }

        for (int i=0,j=si;i<mergedarray.length;i++,j++)
        {
            arr[j]=mergedarray[i];
        }
    }
    public static void divide(int arr[], int si,int ei)
    {
        //base condition
        if(si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String[] args)
    {
       /* int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size of Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element " + (i)+" th element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Unsorted array is:-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n=arr.length;
        divide(arr,0,n-1);
        System.out.println("Your Sorted array is:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}