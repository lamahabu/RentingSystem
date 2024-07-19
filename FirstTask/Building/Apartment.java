public class Apartment extends Building {
    int flourNum;

    public Apartment(String address, BuildingOwner buildingOwner, String name, int price, int size) {
        super(address, buildingOwner, name, price, size);
    }

    public int getFlourNum() {
        return flourNum;
    }

    public void setFlourNum(int flourNum) {
        this.flourNum = flourNum;
    }
}
