package exc5;

import java.util.Scanner;

public class EXC5 
{
    public static boolean isSorted(int[] array)
    {
        for(int i = 0; i<array.length-1; i++)
        {
            if(array[i]>array[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void sortArray(int[] array)
    {
        for(int i = 0 ; i<array.length;i++)
        {
            for(int j = 0; j<array.length-1;j++)
            {
                if(array[j+1]<array[j])
                {
                    int swap = array[j+1];
                    array[j+1] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Etner the list by firstly adding the size of list : ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i =0 ; i<length;i++)
        {
            array[i]  =  scanner.nextInt();
        }
        if(isSorted(array))
        {
            System.out.println("The array is sorted in ascending order.");
        }
        else
        {
            System.out.println("The array is not sorted in ascending order.");
            sortArray(array);
            for(int i = 0 ;i<array.length;i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println("\nThe array is sorted now...");
        }

    }
}
