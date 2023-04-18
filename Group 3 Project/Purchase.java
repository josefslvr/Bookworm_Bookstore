
import java.util.ArrayList;
        import java.util.List;

public class Purchase {
    private Observer priceIndex = new FullPrice();
    private Observer discounts = new Discounts();
    private List<BookID> purchases = new ArrayList<>();

    public void buy(BookID x){
        purchases.add(x);
    }

    public void sell(BookID x){
        purchases.remove(x);
    }

    public void display(){
        for(int i = 0; i< purchases.size(); i++){
            priceIndex.getPrice(purchases.get(i));
            discounts.getPrice(purchases.get(i));
        }
    }
}
