//Search Element in Array

import java.util.Scanner;

public class SearchElement {
    static void ser(int arr[],int n,int x)
    {
        
        for(int i = 0; i < n; i++)
        {
            if (arr[i]==x)
            {
                System.out.print(i);

            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter Elements Of Array : ");
        for(int i=0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\nArray Elements : ");
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }
        System.out.print("\n \nSearch Element : ");
        int x= sc.nextInt();

        System.out.print("\nElement Are Available in Array : ");
        ser(arr, n, x);
    }
    
}
