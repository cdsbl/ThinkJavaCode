public class CountByTens
{
    public static void main(String[] args)
    {
        int num = 0;
        for (int i = 10; i <= 100; i=i+10)
        {
            System.out.println("Counting up to 100 by 10 with for = " + i);
        }

        while (num <= 100)
        {
            System.out.println("Counting up to 100 by 10 with while = " + num);
            num = num + 10;
        }

        num = 0;
        do
        {
            System.out.println("Counting up to 100 by 10 with do while = " + num);
            num = num + 10;
        }
        while (num <= 100);
    }
}
