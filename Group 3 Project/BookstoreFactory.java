public class BookstoreFactory {
    public Book createBook(String genre) {
        if (genre.equalsIgnoreCase("Romance")) {
            return new RomanceBook();
        } else if (genre.equalsIgnoreCase("Mystery")) {
            return new MysteryBook();
        } else if (genre.equalsIgnoreCase("Science Fiction")) {
            return new ScienceFictionBook();
        } else {
            // Return a default book object
            return new BasicBook("Unknown Book", "Unknown Genre");
        }
    }
}