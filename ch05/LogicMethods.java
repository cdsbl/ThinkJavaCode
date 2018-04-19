public class LogicMethods
{
    public static void main(String[] args)
    {
        int number = 3;
        int number1 = 3;
        int number2 = 3;
        printIsLarge(number);
        printIsLargeOrSmall(number);
        printLargest(number1, number2);
        printLargestOdd(number1, number2);
    }

    private static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");
        }
    }

    private static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");
        }
        if (number < 10)
        {
            System.out.println("The number is small");
        }
    }

    private static void printLargest(int number1, int number2)
    {
        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        }
        if (number2 > number1)
        {
            System.out.println("The largest number is: " + number2);
        }
        if (number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
    }

    private static void printLargestOdd(int number1, int number2)
    {//determines if number is odd and then compares
        if (number1 % 3 == 0 && number1 > number2)
        {
            System.out.println("The largest odd number is: " + number1);
        }
        if (number1 % 2 == 0)
        {
            System.out.println("Neither number is odd ");
        }
        if (number1 % 3 == 0 && number2 %3 == 0 && number1==number2)
        {
            System.out.println("Two odds make an even ");
        }
    }
}