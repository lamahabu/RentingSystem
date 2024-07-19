
public class Building {

    String name;
    String address;
    int size;
    int price;
    BuildingOwner buildingOwner;

    public Building(String address, BuildingOwner buildingOwner, String name, int price, int size) {
        this.address = address;
        this.buildingOwner = buildingOwner;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getSize() {
        return this.size;
    }

    public int getPrice(){
    return  this.price;
    }

    public void setBuildingOwner(BuildingOwner buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    public BuildingOwner getBuildingOwner() {
        return buildingOwner;
    }
    
}
