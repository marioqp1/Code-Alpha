public class Room {
    private int number;
    private float price;
    private int numberOfBeds;
    private String roomType;
    private boolean reserved;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Room(int number, float price, int numberOfBeds, String roomType) {
        this.number = number;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.reserved = false;
    }

    public Room() {
    }
}
