import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private static List<Room> listOfAllRooms;
    private static List<Room> listOfAllSingle;
    private static List<Room> listOfAllDouble;
    private static List<Room> listOfAllTriple;
    private static List<Room> listOfAllDeluxeRoom;

    public List<Room> getListOfAllRooms() {
        return listOfAllRooms;
    }

    public List<Room> getListOfAllSingle() {
        return listOfAllSingle;
    }

    public List<Room> getListOfAllDouble() {
        return listOfAllDouble;
    }

    public List<Room> getListOfAllTriple() {
        return listOfAllTriple;
    }

    public List<Room> getListOfAllDeluxeRoom() {
        return listOfAllDeluxeRoom;
    }

    public RoomManager() {
        listOfAllDeluxeRoom= new ArrayList<>();
        listOfAllDouble= new ArrayList<>();
        listOfAllTriple= new ArrayList<>();
        listOfAllSingle= new ArrayList<>();
        listOfAllRooms= new ArrayList<>();

    }

    public void addRoomToRoomCategory(Room room){
        listOfAllRooms.add(room);
        if (room.getRoomType().equals("Single")) {
            listOfAllSingle.add(room);
        } else if (room.getRoomType().equals("Double")) {
            listOfAllDouble.add(room);
        } else if (room.getRoomType().equals("Triple")) {
            listOfAllTriple.add(room);
        } else if (room.getRoomType().equals("Deluxe Room")) {
            listOfAllDeluxeRoom.add(room);
        }
    }
    public List<Room> listOfRoomCategory(String Category){
        if(Category.equals("Single")){
            return getListOfAllSingle();
        } else if (Category.equals("Double")) {
            return getListOfAllDouble();
        } else if (Category.equals("Triple")) {
            return getListOfAllTriple();
        } else if (Category.equals("Deluxe Room")) {
            return getListOfAllDeluxeRoom();
        }
        return new ArrayList<>();
    }
    public List<Room> customerNeed (float price, String Category){
        List<Room> list = new ArrayList<>();
        List<Room> roomList = listOfRoomCategory(Category);
        int size = roomList.size();
        for (int i = 0; i < size; i++) {
            if((roomList.get(i).isReserved())){
               continue;
            }
            if((roomList.get(i).getPrice()+100) >= price || (roomList.get(i).getPrice()-100) <= price )
                list.add(roomList.get(i));
            }
        if (list != null) {
            return list;
        }
        System.out.println("There is no room available right now  you can try again later ->");
        return list;
    }
    public void loadData(){
        Room room = new Room(1,200,1,"Single");
        addRoomToRoomCategory(room);
        Room room1 = new Room(2,400,1,"Double");
        addRoomToRoomCategory(room1);
        Room room2 = new Room(3,600,1,"Triple");
        addRoomToRoomCategory(room2);
        Room room3 = new Room(4,250,1,"Single");
        addRoomToRoomCategory(room3);
        Room room4 = new Room(5,450,1,"Double");
        addRoomToRoomCategory(room4);
        Room room5 = new Room(6,700,1,"Triple");
        addRoomToRoomCategory(room5);
        Room room6 = new Room(7,1000,1,"Deluxe Room");
        addRoomToRoomCategory(room6);
        Room room7 = new Room(8,1000,1,"Deluxe Room");
        addRoomToRoomCategory(room7);
        Room room8 = new Room(9,220,1,"Single");
        addRoomToRoomCategory(room8);
        Room room9 = new Room(10,420,1,"Double");
        addRoomToRoomCategory(room9);
        Room room10 = new Room(11,590,1,"Triple");
        addRoomToRoomCategory(room10);
        Room room11 = new Room(12,250,1,"Single");
        addRoomToRoomCategory(room11);
        Room room12 = new Room(13,450,1,"Double");
        addRoomToRoomCategory(room12);
        Room room13 = new Room(14,730,1,"Triple");
        addRoomToRoomCategory(room13);
        Room room14 = new Room(15,1500,1,"Deluxe Room");
        addRoomToRoomCategory(room14);
        Room room15 = new Room(16,1100,1,"Deluxe Room");
        addRoomToRoomCategory(room15);
    }
    public boolean reserveRoom(int roomNumber,List<Room> roomList){
        boolean found = false;
        for (int i = 0; i < roomList.size(); i++) {
            if(roomList.get(i).getNumber() == roomNumber){
                roomList.get(i).setReserved(true);
                found = true;
                break;
            }
        }
        return found;
    }
        
}
