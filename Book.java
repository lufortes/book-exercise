/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author  Lucita Fortes 
 * @version Sept. 24, 2017
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    /**
     * Return the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    /** 
     * Return the title of the book
     */
    public String getTitle()
    {
        return title;
    }
}
