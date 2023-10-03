import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class LibraryTests {
    private Library library;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        library = new Library();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testLibraryCreation() {
        assertNotNull(library);
        assertEquals("School Library", library.getName());
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Sample Book", "Sample Author", "1234567890", "2022");
        library.addBook(book);
        assertTrue(library.getAllBooks().contains(book));
    }

    @Test
    public void testDisplayAllBooks() {
        Book book1 = new Book("Book 1", "Author 1", "1111", "2000");
        Book book2 = new Book("Book 2", "Author 2", "2222", "2010");
        library.addBook(book1);
        library.addBook(book2);

        library.displayAllBooks();

        String expectedOutput = "School Library have this books:\n" +
                "Name: Book 1\nAuthor: Author 1\nISBN:1111\nPublication Year:2000\n\n" +
                "Name: Book 2\nAuthor: Author 2\nISBN:2222\nPublication Year:2010\n\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFindBookAtName() {
        Book book1 = new Book("Book 1", "Author 1", "1111", "2000");
        Book book2 = new Book("Book 2", "Author 2", "2222", "2010");
        library.addBook(book1);
        library.addBook(book2);

        library.findBookAtName("Book 1");

        String expectedOutput = "Name: Book 1\nAuthor: Author 1\nISBN:1111\nPublication Year:2000\n\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testRemoveBookAtISBN() {
        Book book1 = new Book("Book 1", "Author 1", "1111", "2000");
        Book book2 = new Book("Book 2", "Author 2", "2222", "2010");
        library.addBook(book1);
        library.addBook(book2);

        library.removeBookAtISBN("1111");

        assertFalse(library.getAllBooks().contains(book1));
        assertTrue(library.getAllBooks().contains(book2));
    }
}