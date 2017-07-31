package Book;

import java.util.ArrayList;
import java.util.Scanner;



public class BookDatabase {
     String response="y";
     boolean toCreate=true;
     String selContinue;               
     String bookTitle;
     String bookAuthor;
     String bookCat;
     String bookDescr;
     double bookPrice;
     String sku;
     int choice=1;
     Scanner scan=new Scanner(System.in);
	
		  ArrayList <Book> bookList;

		  public BookDatabase()
		  {

		      this.bookList=new ArrayList<Book>();

		  }
    /*This method takes in an ArrayList of book objects and a experience threshold.

     * It then iterates through the book objects and identify book with

     * Book Author. The method returns an

     * ArrayList of book objects containing only those books who meet this criteria.

     */
		  public ArrayList<Book> searchByAuthor(ArrayList<Book> bookLists,String author)
		    {
                bookLists=new ArrayList<Book>();

                for(Book data:bookList){
                  if(data.getBookAuthor() != null && data.getBookAuthor().contains(author)){

                      return bookLists;
                  }
                  else
                  {
                      System.out.println("There is no Book Author on this Name!");

                  }
     
              }
		        return bookLists;
		    }
    /*This method takes in an ArrayList of book objects and a experience threshold.

     * It then iterates through the book objects and identify book with

     * book sku. The method returns an

     * ArrayList of book objects containing only those books who meet this criteria.
        */
		  public ArrayList<Book> searchBySku(ArrayList<Book> bookLists,String skuFind)
		    {
                bookLists=new ArrayList<Book>();

				for(Book data:bookLists) {
					
					if(data.getSKU() != null &&data.getSKU().equalsIgnoreCase(skuFind)){

                        return bookLists;
					}
					else
					{
						System.out.println("You Entered Wrong Value of SKU of Book!");
					}

				}
                return bookLists;

		    }
    /*This method takes in an ArrayList of book objects and a experience threshold.

  * It then iterates through the book objects and identify book with

  * Book Categories. The method returns an

  * ArrayList of book objects containing only those books who meet this criteria.

  */
		  public ArrayList<Book> searchByCategories(ArrayList<Book> bookLists,String catagFind)
		    {
                bookLists=new ArrayList<Book>();

              for(Book data:bookList){
                  if(data.getBookCategories() != null && data.getBookCategories().contains(catagFind)){

                      return bookLists;
                  }
                  else
                  {
                      System.out.println("There is no Book Categories!");

                  }

              }
		        return bookLists;
		    }
		   public ArrayList<Book> getBookList()
		    {
		        return bookList;
		    }
		   public void SetBookList(ArrayList<Book> bookList)
		    {
		        this.bookList=bookList;
		    }
		   public void addBook()
		    {


			   do{

                   Book bookToAdd=new Book();
                   if(!response.equalsIgnoreCase("y")){
                       System.out.println("You must enter either 'Y' or 'N'");
                   }
			       else {

                       System.out.println("Enter Book SKU:");
                       sku = scan.nextLine();
                       bookToAdd.setSKU(sku);

                       System.out.println("Enter Book Tiltle:");
                       bookTitle = scan.nextLine();
                       bookToAdd.setBookTitle(bookTitle);//Accepting value of title and Capturing the cursor

                       System.out.println("Enter Book Author:");
                       bookAuthor = scan.nextLine();
                       bookToAdd.setBookAuthor(bookAuthor);//Accepting value of Author and Capturing the cursor


                       System.out.println("Enter Book Categories:");
                       bookCat = scan.nextLine();
                       bookToAdd.setBookCategories(bookCat);

                       System.out.println("Enter Book Description:");
                       bookDescr = scan.nextLine();
                       bookToAdd.setBookDescr(bookDescr);

                       System.out.println("Enter Book Price:");
                       bookPrice = scan.nextDouble();
                       bookToAdd.setBookPrice(bookPrice);
                       scan.nextLine();

                       bookList.add(bookToAdd);

                       //Display  book data in an array list using an enhanced for loop and toString
                       for (Book data : bookList) {

                           System.out.println(data.toString());

                       }
                   }
                    System.out.println("Would you like to Create a new entry Books Data(y/n)?");
                    response = scan.nextLine();

           	 }while(!response.equalsIgnoreCase("n"));
           	
		       
		   }
		  
		
}
		
		