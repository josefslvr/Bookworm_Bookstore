public class Discounts implements Observer{
    private int[] discounts = {20, 0, 0, 10, 0};

    @Override
    public int getPrice(BookID x) {
        System.out.println("ID: " + x.getIDNumber() + " comes with a " + discounts[x.getIDNumber()-1] + "% discount.");
        return discounts[x.getIDNumber()-1];
    }
}
