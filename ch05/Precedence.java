public class Precedence

{
    public static void main(String[]args)
    {int sum = 32 - 8 + 16 * 2; //16 x 2 = 32, + 24 = 56
        System.out.println("Default order: " + sum);

        sum = (32 - 8 + 16) * 2; // 24+16=40, x2 = 80
        System.out.println("Specified order: " + sum);

        sum = (32 - (8 + 16)) * 2; // 32-24=8, *2 = 16
        System.out.println("Nested specific order: " + sum);

    }
}

