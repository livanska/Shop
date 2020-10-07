package shoesshop;
import java.util.Comparator;

public class Shoes implements IItem {
    private String brand;
    private int id;
    private int size;
    EShoesCategory type;
    private double price;
    public Shoes( String brand, int size, double price,EShoesCategory type) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
    }
    public Shoes() {

    }

    public String getBrand() {
        return brand;
    }

    public  String getType() {
        return type.name();
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
    public static class ShoesPriceComparator implements Comparator<Shoes> { //static inner class

        public int compare(Shoes s1, Shoes s2) {
            return (int) (s1.price - s2.price);
        }
    }
    public class ShoesSizeComparator implements Comparator<Shoes> { // inner class

        public int compare(Shoes s1, Shoes s2) {
            return s1.size - s2.size;
        }
    }
}
