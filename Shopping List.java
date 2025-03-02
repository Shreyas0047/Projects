import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.println("What item would you like to buy: ");
        item = input.nextLine();
        System.out.println("What is the price for the product: ");
        price = input.nextDouble();
        System.out.println("How many " + item+"'s"+ " would you like to buy");
        quantity = input.nextInt();
        double total = price * quantity;
        System.out.println("You have brought "+ item +"'s");
        System.out.println("Your total is " + total + currency);
        System.out.println("PLEASE PAY THE AMOUNT");


    }
}
