/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Dana Sabatino
 * @version September 19.2016
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
     * Acessor Method for the author field (first part of exercise 2.84) 
     */
    public String getAuthor()
    {  
        return author;
    }
    
    /** 
     * Acessor Method for the title field (second part of exercise 2.84) 
     */
    public String getTitle()
    {  
        return title;
    }

    /**  
     * Acessor method for printing the author and title field (exercise 2.87)
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
