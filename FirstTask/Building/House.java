public class House extends Building{
    int houseNum;
    int roomsNum;

    public House(String address, BuildingOwner buildingOwner, String name, int price, int size) {
        super(address, buildingOwner, name, price, size);
    }

    public int getRoomsNum() {
        return roomsNum;
    }

    public void setRoomsNum(int roomsNum) {
        this.roomsNum = roomsNum;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    
}