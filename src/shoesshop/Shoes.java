package shoesshop;

public class Shoes {
    private String brand;
    private int id;
    private int size;
    EShoesCategory type;
    private double price;
    public Shoes(String brand,int id, int size, double price) {
        this.brand = brand;
        this.id = id;
        this.size = size;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
