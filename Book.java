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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    /**
     * Return the number of pages of the book
     */
    public int getPages()
    {
        return pages;
    }
    /**
     * Print the author of the book
     */
    public void printAuthor()
    {
        System.out.println("The author of the book is " + author);
    }
    /**
     * Print the title of the book 
     */
    public void printTitle()
    {
        System.out.println("The title of the book is " + title);
    }
    /**
     * Print details of the book
     */
    public void printDetails()
    {
        System.out.println("*******************************************");
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages:  " + pages);
        System.out.println("*******************************************");
    }
    /**
     * Set reference number
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref; 
    }
    /**
     * Get reference number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
}
