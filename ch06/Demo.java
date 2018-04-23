public class Demo
{
    public static void main(String[] args)
    {
        int firstValue = 5;
        int secondValue = 50;
        int thirdValue = 200;

        int firstValueBig = howBig(firstValue);
        int secondValueBig = howBig(secondValue);
        int thirdValueBig = howBig(thirdValue);

        System.out.println("firstValue is " + firstValue + "howBig returns: " + firstValueBig);
        System.out.println("secondValue is " + secondValue + "howBig returns: " + secondValueBig);
        System.out.println("thirdValue is " + thirdValue + "howBig returns: " + thirdValueBig);
    }


    //returns 0 if value less than 10
    //returns 1 if value 10 to 100
    // returns 2 if value more than 100
    private static int howBig(int value)
    {
        int answer;

        if (value >= 10 && value <= 100)
        {
            answer = 1;
        } else if (value > 100)
        {
            answer = 2;
        } else
        {
            answer = 0;
        }
        return answer;
    }
}