import java.lang.String;
import java.util.Scanner;

public class Main {

    /**
     * It is main func
     */
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.print("enter first num: ");
        first = num.nextFloat();
        System.out.print("enter second num: ");
        second = num.nextFloat();
        result = first * second;

        System.out.println("Result is: " + result);
    }
}
