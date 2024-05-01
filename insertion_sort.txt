public class Stringss {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int [] arr={7,3,1,2,8};
        for(int i=1;i<arr.length;i++)
        {
            int currentelement=arr[i];
            int j=i-1;
            while(j>=0 && currentelement<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentelement;
        }
        printarray(arr);
    }


}
