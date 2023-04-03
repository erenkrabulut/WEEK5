package exc1;

public class EXC1 
{
    public static int[][] first() 
    {
        int[][] matrix = new int[10][10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int column = 0; column < matrix[row].length; column++) 
            {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] second()
    {
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int column = 0; column < matrix[row].length; column++) 
            {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        return matrix;
    }
    public static void third(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int column = 0; column < matrix[row].length; column++) 
            {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static int fourth(int[][] matrix)
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                total += matrix[row][column];
            }
        }
        return total;
    }
    public static void fifth(int[][] matrix)
    {
        for (int column = 0; column < matrix[0].length; column++) 
        {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
            {
                total += matrix[row][column];
                System.out.println("Sum for column " + column + " is " + total);
            }
        }
    }
    public static int sixth(int[][] matrix)
    {
        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) 
        {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) 
        {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
            {
                totalOfThisRow += matrix[row][column];
                if (totalOfThisRow > maxRow) 
                {
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
            System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);   
        }
        return indexOfMaxRow;
    }
    public static void seventh(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }
    public static void eigth31()
    {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) 
        {
            for (int j = array[i].length - 1; j >= 0; j--)
            {
                System.out.print(array[i][j] + " ");
                System.out.println();
            }
        }
    }
    public static void eigth32()
    {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i][0];
            System.out.println(sum);   
        }
    }
    
}
