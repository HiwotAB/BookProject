package Book;

import java.util.ArrayList;
import java.util.Scanner;



public class BookDatabase {
	 boolean toContinue=true;
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
		  
		  public ArrayList<Book> searchByAuthor(ArrayList<Book> bookList,String author)
		    {
			  author=scan.next();
              scan.nextLine();
			  for(Book data:bookList){
                  if(data.getBookAuthor() != null && data.getBookAuthor().contains(author)){
                      System.out.println("SKU: "+data.getSKU());                       
                      System.out.println("Book Title: "+data.getBookTitle());
                      System.out.println("Book Author Name: "+data.getBookAuthor());
                      System.out.println("Book Categories: "+data.getBookCategories());
                      System.out.println("Book Description: "+data.getBookDescr());
                      System.out.println("Book Price: "+data.getBookPrice());

                  }
                  else
                  {
                      System.out.println("There is no Book Author on this Name!");

                  }
     
              }
		        return new ArrayList<Book>();
		    }
		  public ArrayList<Book> searchBySku(ArrayList<Book> bookList,String skuFind)		  	 
		    {
			  
				skuFind=scan.nextLine();
				scan.nextLine();
				 
				for(Book data:bookList) {				
					
					if(data.getSKU() != null && data.getSKU().equalsIgnoreCase(skuFind)){
						System.out.println("Inside If");	
					System.out.println("SKU: "+data.getSKU());						
					System.out.println("Book Title: "+data.getBookTitle());
					System.out.println("Book Author Name: "+data.getBookAuthor());
					System.out.println("Book Description: "+data.getBookDescr());
					System.out.println("Book Price: "+data.getBookPrice());
					}
					else
					{
						System.out.println("You Entered Wrong Value of SKU of Book!");
					}
					
					
				}
               
		        return new ArrayList<Book>();
		    }
		  public ArrayList<Book> searchByCategories(ArrayList<Book> bookList,String catagFind)
		    {
			  catagFind=scan.next();
              scan.nextLine();

              for(Book data:bookList){
                  if(data.getBookCategories() != null && data.getBookCategories().contains(catagFind)){
                      System.out.println("SKU: "+data.getSKU());                       
                      System.out.println("Book Title: "+data.getBookTitle());
                      System.out.println("Book Author Name: "+data.getBookAuthor());
                      System.out.println("Book Categories: "+data.getBookCategories());
                      System.out.println("Book Description: "+data.getBookDescr());
                      System.out.println("Book Price: "+data.getBookPrice());

                  }
                  else
                  {
                      System.out.println("There is no Book Categories!");

                  }

              }
		        return new ArrayList<Book>();
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
     			   	System.out.println("Enter Book SKU:");
                    sku=scan.nextLine();
                    bookToAdd.setSKU(sku);
                    
                    System.out.println("Enter Book Tiltle:");
                    bookTitle=scan.nextLine();
                    bookToAdd.setBookTitle(bookTitle);//Accepting value of title and Capturing the cursor
                   
                    System.out.println("Enter Book Author:");
                    bookAuthor=scan.nextLine();
                    bookToAdd.setBookAuthor(bookAuthor);//Accepting value of Author and Capturing the cursor
                   

                    System.out.println("Enter Book Categories:");
                    bookCat=scan.nextLine();
                    bookToAdd.setBookCategories(bookCat);
                   
                    System.out.println("Enter Book Description:");
                    bookDescr=scan.nextLine();
                    bookToAdd.setBookDescr(bookDescr);
                   
                    System.out.println("Enter Book Price:");
                    bookPrice=scan.nextDouble();
                    bookToAdd.setBookPrice(bookPrice);   
                    
                    bookList.add(bookToAdd);
                   
                    //Display  book data in an array list using an enhanced for loop and toString
                    for(Book data:bookList) {                       
                       
                        System.out.println(data.toString());
                       
                    }
                    scan.nextLine();       
                    System.out.println("Would you like to Create a new entry Books Data(y/n)");               
                    selContinue=scan.nextLine();
                    if(selContinue.equalsIgnoreCase("y"))
                    {
                        toContinue=true;
                    }
                    else
                    {
                        toContinue=false;   
                    }
           	 }while(toContinue=true);
           	
		       
		   }
		  
		
}
		
		