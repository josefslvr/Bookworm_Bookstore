public abstract class BookDecorator implements Book {
    protected Book book;
    
    public BookDecorator(Book book) {
        this.book = book;
    }
    
    @Override
    public String getTitle() {
        return book.getTitle();
    }
    
    @Override
    public String getGenre() {
        return book.getGenre();
    }
}