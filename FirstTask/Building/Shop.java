public class Shop extends Building{
    String shopType;

    public Shop(String address, BuildingOwner buildingOwner, String name, int price, int size) {
        super(address, buildingOwner, name, price, size);
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
    
}