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
    private int pages;      //added new field pages to contain the number of pages in the book (exericse 2.85)

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;        //added the new field initiator in the constructor (exercise 2.85)
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
     * Acessor Method for the pages field (second part of exercise 2.85) 
     */
    public int getPages()
    {  
        return pages;
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
    
     /**  
     * Acessor method for printing the author and title field (exercise 2.87)
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author);
    }

}
