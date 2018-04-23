import  java.util.Scanner;
public class Temperature
{public static void main(String[] args)
{String line;

//create some variables to hold the two temperature values
    double celsius;
    double fahrenheit;
//create a scanner to read the keyboard input
    Scanner in = new Scanner(System.in);

    // prompt the user and get Celsius value
    System.out.print("What is the temperature outside in degrees Celsius?");
    //wait for the value from the keyboard and then
    //assign it to the celsius variable
    celsius = in.nextDouble();

    //Show user the value they entered
    System.out.println("You entered " + celsius +  " for Celsius");
//Do some math and convert from celsius and fahrenheit
    fahrenheit = (celsius * 9.0/5.0)+32;
    System.out.println("The temperature in Fahrenheit is:  " + fahrenheit);




}

}
