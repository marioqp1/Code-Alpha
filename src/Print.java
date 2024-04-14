import java.util.Scanner;

public class Print {
    /*
    Single
    Double
    Triple
    Deluxe Room

     */
     Scanner scanner = new Scanner(System.in);
    public static void printCategory(){
        System.out.println("1- Single");
        System.out.println("2- Double");
        System.out.println("3- Triple");
        System.out.println("4- Deluxe Room");
    }
    public  static int printMain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check available room with category ( 1 )");
        System.out.println("Know about our rooms category ( 2 )");
        System.out.println("Check all rooms ( 3 )");
        System.out.println("To exit ( 4 )");

        return scanner.nextInt();

    }
    public static void printPaymentMethods(){
        System.out.println("Payment Methods is (VISA || CASH)");
    }
}
