import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of your item: ");
        double itemPrice = scanner.nextDouble();
        double shipping = 0;

        if(itemPrice >= 100)
        {
            shipping = 0;
        }
        else
        {
            shipping = itemPrice * 0.02;
        }

        double finalCost = itemPrice + shipping;
        System.out.println("The shipping cost is " + shipping + " and the total price is " + finalCost);

        scanner.close();

    }
}