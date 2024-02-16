public class Product {
    private static int lastId = 0;
    private int idProduct;
    private String name;
    private String brand;
    private int price;

    public Product(String name, String brand, int price) {
        lastId++;
        this.idProduct = lastId;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
