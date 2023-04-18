public class FullPrice implements Observer {
    private int[] priceIndex = {15, 10, 20, 6, 12};

    @Override
    public int getPrice(BookID x) {
        //Indexes and elements represent bookID and prices respectively
        System.out.println("Book with ID " + x.getIDNumber() + " cost $" + priceIndex[x.getIDNumber()-1]);
        return priceIndex[x.getIDNumber()-1];
    }
}
