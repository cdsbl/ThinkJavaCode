public class StringUtil
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to StringUtil");

        String firstCharacterofHello = getFirstCharacter("Hello");
        System.out.println("getFirstCharacter for Hello returns " + firstCharacterofHello);

        String firstCharacterofGoodbye = getFirstCharacter("Goodbye");
        System.out.println("getFirstCharacter for Goodbye returns " + firstCharacterofGoodbye);

        String lastCharacterofHello = getLastCharacter("Hello");
        System.out.println("getLastCharacter for Hello returns " + lastCharacterofHello);

        String firstTwoCharactersOfHello = getFirstTwoCharacters("Hello");
        System.out.println("getFirstTwoCharacters for Hello returns " + firstTwoCharactersOfHello);

        String firstTwoCharactersOfGoodbye = getFirstTwoCharacters("Goodbye");
        System.out.println("getFirstTwoCharacters for Goodbye returns " + firstTwoCharactersOfGoodbye);

        String lastTwoCharactersOfHello = getLastTwoCharacters("Hello");
        System.out.println("getLastTwoCharacters for Hello returns " + lastTwoCharactersOfHello);

        String lastTwoCharactersOfGoodbye = getLastTwoCharacters("Goodbye");
        System.out.println("getLastTwoCharacters for Goodbye returns " + lastTwoCharactersOfGoodbye);

        String allButFirstThreeCharactersOfHello = getAllButFirstThreeCharacters("Hello");
        System.out.println("allButFirstThreeCharacters for Hello returns " + allButFirstThreeCharactersOfHello);

        String allButFirstThreeCharactersOfGoodbye = getAllButFirstThreeCharacters("Goodbye");
        System.out.println("allButFirstThreeCharacters for Goodbye returns " + allButFirstThreeCharactersOfGoodbye);

        //HOW DO I GET/PRINT THE INDEX??? 9-B-6
        String printCharacters = getprintCharacters("Hello");

    }


    private static String getLastCharacter(String value)
    {
        int startIndex = value.length() - 1;
        return value.substring(startIndex, startIndex + 1);

    }

    private static String getFirstCharacter(String value)
    {
        return value.substring(0, 1);
    }

    private static String getFirstTwoCharacters(String value)
    {
        return value.substring(0, 2);
    }

    private static String getLastTwoCharacters(String value)
    {
        int startIndex = value.length() - 2;
        return value.substring(startIndex, startIndex + 2);
    }

    private static String getAllButFirstThreeCharacters(String value)
    {
        return value.substring(3);
    }

    private static String getprintCharacters(String value)
    {
        for
                (int i = 0; i < value.length(); i++)
        {
            char letter = value.charAt(i);
            //int = value.substring(i);////HOW DO I PRINT THE INDEX???
            System.out.println(letter + ":");
        }
        return value;
    }

    private static void printPhoneNumber(String area, String exchange, String line)
    {
        String phoneNumber = area.substring(0,3) + exchange.substring(3,6) + line.substring (6,9);
        System.out.print("Phone Number is" + area);
    }


    //private static String findFirstE ("Hello")
    //{
    // return int index = value.indexOf('e');
    //}

    //private static String isFinn (String value)

    //if name1=="Finn"
    //{
    //return = true;
    //}}
}