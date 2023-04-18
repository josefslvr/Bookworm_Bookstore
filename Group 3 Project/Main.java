public class Main {
    public static void main(String[] args) {
        //Factory pattern Unit Test
        BookstoreFactory bookFactory = new BookstoreFactory();

        Book romanceBook = bookFactory.createBook("Romance");
        System.out.println("Genre of book 1: " + romanceBook.getGenre());

        Book mysteryBook = bookFactory.createBook("Mystery");
        System.out.println("Genre of book 2: " + mysteryBook.getGenre());

        Book sciFiBook = bookFactory.createBook("Science Fiction");
        System.out.println("Genre of book 3: " + sciFiBook.getGenre());

        Book book = new BasicBook("Harry Potter and the Philosopher's Stone", "Fantasy");
        book = new RatedBook(book, 4);
        book = new FanClubBook(book, "Dudley");
        System.out.println("Title of book 4: " + book.getTitle());
        
        BookID bookID = BookID.getNextBook();
        System.out.println("ID Number of book 4: " + bookID.getIDNumber());
        System.out.println("Time of purchase of book 4: " + bookID.getTimeOfPurchase());
    }
}
