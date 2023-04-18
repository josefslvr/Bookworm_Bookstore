public class RatedBook extends BookDecorator {
    private int rating;
    
    public RatedBook(Book book, int rating) {
        super(book);
        this.rating = rating;
    }
    
    @Override
    public String getTitle() {
        return super.getTitle() + " (rated " + rating + "/5)";
    }

    public int getRating() {
        return rating ;
    }
}
