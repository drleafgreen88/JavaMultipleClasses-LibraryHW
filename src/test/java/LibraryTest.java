import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before (){
        library = new Library();
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookIfEnoughRoom(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);

        assertEquals(3, library.bookCount());
    }
}
