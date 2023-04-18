import java.time.LocalDateTime;

public class BookID {
    private static int _currentNumber = 0;
    private int IDNumber;
    private LocalDateTime timeOfPurchase;

    public int getIDNumber() {
        return IDNumber;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    private BookID() {
        this.timeOfPurchase = LocalDateTime.now();
    }

    public static BookID getNextBook() {
        BookID bookID = new BookID();
        _currentNumber += 1;
        bookID.IDNumber = _currentNumber;
        return bookID;
    }
}
