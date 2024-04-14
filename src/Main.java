import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        RoomManager roomManager = new RoomManager();
        roomManager.loadData();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("Welcome to our hotel reservation system -> ");
            Print.printMain();
            choice = scanner.nextInt();

        while(choice != 4){

            if(choice == 1){
                int categoryChose;
                float price;
                System.out.println("Chose one category ");
                Print.printCategory();
                System.out.println("Back ( 5 )");
                categoryChose = scanner.nextInt();
                System.out.println("Enter your budget: ");
                price = scanner.nextFloat();
                ArrayList<Room> listOfRoom;
                boolean done = false;
                String category = " ";
                if(categoryChose == 1)
                {
                    category = "Single";
                    done = true;
                }
                else if (categoryChose == 2)
                {
                    category = "Double";
                    done = true;

                }else if (categoryChose == 3)
                {
                    category = "Triple";
                    done = true;
                }
                else if (categoryChose == 4)
                {
                    category = "Deluxe Room";
                    done = true;
                }
                else if (categoryChose == 5)
                {
                    System.out.println("<-");
                    choice = Print.printMain();
                }
                else
                {
                    System.out.println(" Error try again");

                }
                if(done)
                {
                    listOfRoom = (ArrayList<Room>) roomManager.customerNeed(price,category);
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    for (int i = 0; i < listOfRoom.size(); i++)
                    {
                        Room room = listOfRoom.get(i);
                        System.out.println("Room n. "+ room.getNumber()+"- price "+room.getPrice()+" - number of beds is: "+room.getNumberOfBeds()+"- Category is: "+ room.getRoomType());
                    }
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("If you want to reserve room ( 1 )");
                    System.out.println("If no ( 2 )");
                    int Chose = scanner.nextInt();
                    if(Chose == 1){
                        Print.printPaymentMethods();
                        System.out.println("Give me please the room number you want to reserve: ");
                        int roomNumber = scanner.nextInt();
                        boolean status = roomManager.reserveRoom(roomNumber,listOfRoom);
                        if(status)
                        {
                            System.out.println("Room is reserved ");
                        }
                        else
                        {
                            System.out.println("room can not found please try again later ");
                        }
                    }
                    else choice = Print.printMain();
                }

            }
            else if (choice == 2)
            {

                Print.printCategory();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                choice = Print.printMain();

            } else if (choice == 3) {
                System.out.println("All rooms ->");
                List<Room> roomList = roomManager.getListOfAllRooms();
                for (int i = 0; i < roomList.size(); i++) {
                    Room room = roomList.get(i);
                    System.out.println("Room n. " + room.getNumber() + "- price " + room.getPrice() + " - number of beds is: " + room.getNumberOfBeds() + "- Category is: " + room.getRoomType());
                }
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("If you want to reserve room ( 1 )");
                System.out.println("If no ( 2 )");
                int Chose = scanner.nextInt();
                if (Chose == 1) {
                    Print.printPaymentMethods();
                    System.out.println("Give me please the room number you want to reserve: ");
                    int roomNumber = scanner.nextInt();
                    boolean status = roomManager.reserveRoom(roomNumber, roomList);
                    if (status) {
                        System.out.println("Room is reserved ");
                    } else {
                        System.out.println("room can not found please try again later ");
                    }
                }
            }
            else
            {
                System.out.println("Please chose a valid number -> ");

            }
        }
    }
}