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
    private String refNumber;  //added new field ferNumber to contain the refence number for a library (exercise 2.88)
    private int borrowed;   //added new field borrowed to contain the number of times the book has been borrowed (exercise 2.91)
    private boolean courseText;  //added a new field courseText to contain the boolean value of whether the book is being used as a text for a class (exercise 2.92)

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNumber, boolean isTextbook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;        //added the new field (pages) initiator in the constructor (exercise 2.85)
        refNumber = "";            //added the new field (refNumber) initiator in the constructor (exercise 2.88)
        borrowed = 0;              //added the new field (borrowed) inititator in the constructor (exercise 2.91)
        courseText = isTextbook;   //added the new field (courseText) initiator in the constructor (exercise 2.92)
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
     * Acessor method for printing the pages field (exercise 2.87)
     */
    public void printPages()
    {
        System.out.println("Pages: " + pages);
    }
    
     /**  
     * Acessor method for printing the author, title, and pages field (exercise 2.87)
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        System.out.println("This book has been borrowed " + borrowed + " time(s)");    //method modified to display field borrowed (exercise 2.91)
        if (refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber); //method modified to include refNumber field (exercise 2.89)
        }
        else
        {
            System.out.println("Reference Number: ZZZ");
        }
    }

    
    /**
     * Mutator method for changing the library refernce number field if it is of an appropriate value (exercise 2.90)
     */
    public void setRefNumber(String ref)
    {
       if (ref.length() >= 3)
       {
           refNumber = ref;
       }
       else
       {
           System.out.println("iputted reference number is too short, it must be three characters or longer");
       }
    }
    
   /** 
     * Acessor Method for the refNumber field (exercise 2.88) 
     */
    public String getRefNumber()
    {  
        return refNumber;
    }
    
   /**
    * Mutator method for borrowed field, calling this method increments borrowed by one (exercise 2.91)
    */
    public void borrow()
    {
        borrowed += 1;
    }
    
   /** 
    *Acessor method for borrowed field (exercise 2.91)
    */
   public int getBorrowed()
   {
       return borrowed;
   }
   
    /** 
     * Acessor Method for the courseText field (exercise 2.92) 
     */
    public boolean isCourseText()
    {  
        return courseText;
    }
}
