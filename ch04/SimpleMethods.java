import java.sql.SQLOutput;

public class SimpleMethods
{//This is the main method to assign values for 4-A and 4-B
    public static void main(String[] args)
    {//These are the variables for 4-A
        printCount(5);
        int count = 9;
        printCount(count);
        int someNumber = 3;
        printCount(someNumber);
        //These are the variables for 4-B
        int num1 = 2;
        int num2 = 4;
        printSum(num1 + num2);
        //These is the variable for 4-C
        boolean isStudent=true;
        printBoolean(isStudent);
    }

//This is the method for 4-A
    public static void printCount(int count)
    {
        System.out.println("The count is: " + count);
    }

    //This is the method for 4-B
    public static void printSum(int sum)
    {
System.out.println("The sum is: " + sum);
    }

    //This is the method for 4-C
    public static void printBoolean (boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }
}