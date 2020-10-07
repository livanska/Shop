package shoesshop;

public class Main {


    public static void main(String[] args) {
        ShoesManager shopManager = new ShoesManager();
        Customer shopCustomer = new Customer();
        Seller shopSeller = new Seller ();
        Shoes shoes = new Shoes("Prada",38,1500,EShoesCategory.formal);
        Shoes shoes1 = new Shoes("Gucci",37,2000,EShoesCategory.formal);
        Shoes shoes2 = new Shoes("Nike",36,1000,EShoesCategory.sport );
        Shoes shoes3 = new Shoes("Timberland",39,2500, EShoesCategory.winter);
        shopSeller.addShoes(shopManager,shoes);
        shopSeller.addShoes(shopManager,shoes1);
        shopSeller.addShoes(shopManager,shoes2);
        shopSeller.addShoes(shopManager,shoes3);
        shopManager.showAll();
        //shopManager.deleteItem(1);
        shopCustomer.buy(shopManager,3);
        shopManager.showAll();
        shopManager.sortByPrice(true);
        shopManager.showAll();
        shopManager.sortByBrand(true);
        shopManager.showAll();

    }
}
