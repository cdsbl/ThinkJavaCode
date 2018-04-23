public class Count
{
    public static void main(String[] args)
    {
        int num = 0;
        for (int i = 0+1; i <= 10; i++)
        {
            System.out.println("Counting up to 10 by 1 with for = " + i);
        }

        while(num<=10)
        {
            System.out.println("Counting up to 10 by 1 with while = " + num);
            num++;
        }

        num = 1;
        do
        {
            System.out.println("Counting up to 10 by 1 with do while = " + num);
            num++;
        }
        while(num<=10);
    }


}
