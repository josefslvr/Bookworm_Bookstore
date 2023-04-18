import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class PriceTest {
    BookID purchaseTest = BookID.getNextBook();
    @org.junit.jupiter.api.Test
    void getBookPrice(){


        Observer price = new FullPrice();
        assertTrue((purchaseTest.getIDNumber() == 1 && price.getPrice(purchaseTest) == 15) ||
                (purchaseTest.getIDNumber() == 2 && price.getPrice(purchaseTest) == 10) ||
                (purchaseTest.getIDNumber() == 3 && price.getPrice(purchaseTest) == 20) ||
                (purchaseTest.getIDNumber() == 4 && price.getPrice(purchaseTest) == 6) ||
                (purchaseTest.getIDNumber() == 5 && price.getPrice(purchaseTest) == 12));
    }


    @org.junit.jupiter.api.Test
    void getDiscountPrice(){
        Observer discount = new Discounts();
        assertTrue((purchaseTest.getIDNumber() == 1 && discount.getPrice(purchaseTest) == 20) ||
                (purchaseTest.getIDNumber() == 2 && discount.getPrice(purchaseTest) == 0) ||
                (purchaseTest.getIDNumber() == 3 && discount.getPrice(purchaseTest) == 0) ||
                (purchaseTest.getIDNumber() == 4 && discount.getPrice(purchaseTest) == 10) ||
                (purchaseTest.getIDNumber() == 5 && discount.getPrice(purchaseTest) == 0));
    }


}


