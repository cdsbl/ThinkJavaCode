public class CountByEight
{
    public static void main(String[] args)
    {
        int num = 100;
        for (int i = 100; i <= 100 && i >= -100; i = i - 8)
        {
            System.out.println("Decreasing by 8 with for = " + i);
        }

        while (num <= 100 && num>=-100)
        {
            System.out.println("Decreasing by 8 with while = " + num);
            num = num - 8;
        }

        num = 100;
        do
        {
            System.out.println("Decreasing by 8 with do while = " + num);
            num = num - 8;
        }
        while (num <= 100 && num>=-100);

    }

}
