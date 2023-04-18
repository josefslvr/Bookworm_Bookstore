import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class FanClubBookTest {
    @Test
    void testGetMemberName() {
        Book book = new BasicBook("The Girl on the Train" , "Drama");
        book = new FanClubBook(book, "Sophia");
        FanClubBook fanClubBook = (FanClubBook) book;
        assertEquals("Sophia", fanClubBook.getMemberName());
    }
}
