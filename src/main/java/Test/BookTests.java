import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTests {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Sample Book", "Sample Author", "1234567890", "2022");
    }
    @Test
    public void testBookCreation() {
        assertNotNull(book);
        assertEquals("Sample Book", book.name);
        assertEquals("Sample Author", book.author);
        assertEquals("1234567890", book.ISBN);
        assertEquals("2022", book.yearPublication);
    }
}