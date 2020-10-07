package shoesshop;

public class Customer extends User{
    protected double cash;
    protected void increaseCash(double sum){
        this.cash += sum;
    }
    protected void buy(double sum, ShoesManager manager,int id){
        this.cash += sum;
        manager.deleteItem(id);
    }

}
