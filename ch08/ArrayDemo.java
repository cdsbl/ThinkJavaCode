public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] values = {1, 5, 9}; // These are the values for 8-A in main
        printArray(values);
        System.out.println();

        int[] sumNumbers = {5, 7, 13}; //These are the values for 8-B in main
        int sum = arrayTotal(sumNumbers);
        printArray(sumNumbers);
        System.out.println("The numbers added up to " + sum);

        int[] maxNumbers = {5, 8, 21, 19, 2}; //These are the values for 8-C in main
        int max = arrayMax(maxNumbers);
        printArray(maxNumbers);
        System.out.println("The highest number is " + max);

        int[] indexNumbers = {78, 23, 9, 34}; //These are the values for 8-D in main
        int index = arrayMaxIndex(indexNumbers);
        printArray(indexNumbers);
        System.out.println("The highest index is " + index);

        double[] avgValue = {34.2, 18.0, 12.5, 13.1}; //These are the values for 8-E in main
        double average = arrayAverage(avgValue);
        System.out.println("The average is " + average);

    }

    private static void printArray(int[] values)//This is the method for 8-A
    {
        for (int value : values)
            System.out.println(value);
    }

    private static int arrayTotal(int[] values) //This is the method for 8-B
    {
        int sum = 0;
        for (int value : values)
        {
            sum = sum + value;
        }
        return sum;
    }

    private static int arrayMax(int[] values) //This is the method for 8-C
    {
        int max = 0;
        for (int value : values)
        {
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }

    private static int arrayMaxIndex(int[] values) //This is the method for 8-D
    {
        int max = 0;
        int indexMax = 0;
        int index = 0;

        for (int value : values)
        {
            if (value > max)
            {
                max = value;
                indexMax = index;
            }
            index = index + 1;
        }
        return indexMax;
    }

    private static double arrayAverage(double[] values) //This is the method for 8-E
    {
        double sum = 0.0;
        for (double value : values)
        {
            sum = (sum + value);
        }
        double average = sum/4;
        return average;

    }
}



