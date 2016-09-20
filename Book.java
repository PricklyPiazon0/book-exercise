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
     * Acessor Method for the author field (first part of exercise 2.83) 
     */
    public String getAuthor()
    {  
        return author;
    }
    
    /** 
     * Acessor Method for the title field (second part of exercise 2.83) 
     */
    public String getTitle()
    {  
        return title;
    }

     /**  
     * Acessor method for printing the author (exercise 2.84)
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
     /**  
     * Acessor method for printing the title field (exercise 2.84)
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    

}
