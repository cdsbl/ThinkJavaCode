public class DateTester
{
    public static void main(String[] args)
    {
        Date currentDate = new Date (27, 4, 2018);
        printcurrentDate(Date);
    }
    public static void currentDate (Date[] Date)
    {
        for (Date date : Date)
        {
            System.out.println(date.getDate());
        }
    }

}
