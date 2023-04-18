import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class RatedBookTest {
    @Test
    void testGetRating() {
        Book book = new BasicBook("The Da Vinci Code" , "Mystery");
        book = new RatedBook(book, 3);
        RatedBook ratedBook = (RatedBook) book;
        assertEquals(3, ratedBook.getRating());
    }
}
