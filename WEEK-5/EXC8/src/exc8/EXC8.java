package exc8;

import java.util.Scanner;
public class EXC8 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array : ");
        int row = s.nextInt();
        int column = s.nextInt();
        System.out.println("Enter the array : ");
        double[][] array = new double[row][column];
        for(int i = 0 ; i<array.length; i++)
        {
            for(int j = 0; j< array[0].length; j++)
            {
                array[i][j]= s.nextDouble();
            }
        }
        Location.locateLargest(array);
    }
}
