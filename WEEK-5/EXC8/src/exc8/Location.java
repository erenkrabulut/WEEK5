package exc8;

public class Location 
{
    static int row;
    static int column;
    static double maxValue = Double.MIN_VALUE;
    public static Location locateLargest(double[][] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j = 0 ; j<array[0].length; j++)
            {
                if(array[i][j]>maxValue)
                {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.printf("The location of the largest element is %.2f at (%d, %d)\n",maxValue,row,column);
        return null;
    }

}
