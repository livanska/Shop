package shoesshop;

public class Seller extends User{
    public void addShoes(ShoesManager manager,Shoes shoes){
        manager.addItem( shoes);
    }
}
