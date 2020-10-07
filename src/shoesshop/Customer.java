package shoesshop;

public class Customer extends User{
    protected double cash;
    protected void increaseCash(double sum){
        this.cash += sum;
        System.out.println("Your balance: "+ this.cash);
        System.out.println();
    }
    protected void buy(ShoesManager manager,int id){
        Double sum = manager.findSumById(id);
        if(sum >0 ) {
            this.cash += sum;
            manager.deleteItem(id);
        }
        else {
            System.out.println("No shoes with such ID");

        }
        System.out.println();
    }

}
