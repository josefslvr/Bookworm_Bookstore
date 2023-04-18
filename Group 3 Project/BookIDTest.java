import java.awt.print.Book;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookIDTest {

    @org.junit.jupiter.api.Test
    void idTest1() {
        BookID id1 = BookID.getNextBook();
        assertTrue(id1.getIDNumber()==1);
    }
    @org.junit.jupiter.api.Test
    void idTest2() {
        BookID id2 = BookID.getNextBook();
        assertTrue(id2.getTimeOfPurchase().getDayOfMonth()== LocalDateTime.now().getDayOfMonth());
    }
}

