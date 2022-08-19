public class ReverseArray
{
    static void Reverse(int arr[],int n)
    {
        int low = 0,high = n-1;

        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {3,4,5,6},n = 4;

        System.out.println("Before Reverse");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        Reverse(arr,n);

        System.out.println("After Reverse");

        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
