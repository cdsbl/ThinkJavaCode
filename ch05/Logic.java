public class Logic

{public static void main(String[]args)
        // Assign boolean
{boolean yes = true;
boolean no = false;
// Test boolean both
    System.out.println("Both YesYes True: " + (yes&&yes));
    System.out.println("Both YesNo True: " + (yes&&no));
  // Test boolean either
    System.out.println( "Either YesYes True: " + (yes||yes));
    System.out.println( "Either YesNo True: " + (yes||no));
    System.out.println("Either NoNo True: " + (yes||yes));
    //Show original and inverse value
    System.out.println("Original Yes Value: " + yes);
    System.out.println("Inverse Yes Value: " + !yes);
}
}
