import java.util.Scanner;

public class LargestElement 
{

    static int largest(int arr[],int n)
    {        
        for(int i=0; i < n; i++)
        {
            boolean flag = true;
            for(int j = 0; j < n; j++)
            {
                if(arr[j]>arr[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                return i;    
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        /*Scanner s = new Scanner(System.in);

        System.out.println("Enter number of elements in Array");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Elements in Array ");

        for(int i: arr)
        {
            System.out.print(i+ "  ");
        }

        System.out.println();
        //largest(arr);
        System.out.println("Lagrest Element of index = "+largest(arr));  */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter array Size = ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements ");
        for(int i=0; i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print("Array List : ");

        for(int i : arr)
        {
            System.out.print(i+ "  ");
        }

        System.out.println("\nLargest element in Arraylist and its index is :"+ largest(arr,n));

        }
    
}





