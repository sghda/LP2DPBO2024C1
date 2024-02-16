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

class Clothing extends Product {
    private String size;
    private String material;
    private String gender;

    public Clothing(String name, String brand, int price, String size, String material, String gender) {
        super(name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Shirt extends Clothing {
    private String color;
    private String sleeveType;

    public Shirt(String name, String brand, int price, String size, String material, String gender, String color, String sleeveType) {
        super(name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }
}
