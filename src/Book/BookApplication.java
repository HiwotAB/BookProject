package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApplication {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
         // Identifier declaration    
            
             boolean toContinue=true;
             boolean toCreate=true;
             String selContinue;               
             String bookTitle;
             String bookAuthor=null;
             String bookCat=null;
             String bookDescr=null;
             double bookPrice;
             String sku=null;
             int choice=1;
                    
             //Declare an array list variable and Initialize the array list  and type of array list that is class
            ArrayList<Book> bookList=new ArrayList<Book>();
            
              
               
            	 		// declaration of class and instantiation of class object
                        Book book=new Book();
            	 		BookDatabase bookDatabase=new BookDatabase();
                       
            	 		 // Set the values of attribute of Book class
            	 		Book bookOne=new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates ","Programming","Easy to read Java workbook", 47.50);
            	 		Book bookTwo=new Book("Java1002","Thinking in Java","Bruce Eckel","Programming","Details about Java under the hood", 20.00);
            	 		Book bookThree=new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky ","Oracle","Everything you need to know in one place", 45.00);
            	 		Book bookFour=new Book("Python1004","Automate the Boring Stuff with Python","Al Sweigart","Programming","Fun with Python", 10.50);
            	 		Book bookFive=new Book("Zombie1005","The Maker's Guide to the Zombie Apocalypse ","Simon Monk","Programming","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50);
            	 		Book bookSix=new Book("Rasp1006","Raspberry Pi Projects for the Evil Genius ","Donald Norris","Programming","A dozen fiendishly fun projects for the Raspberry Pi!",14.75);
                      
                      //Add to myArrayList  
                        bookDatabase.bookList.add(bookOne);     
                        bookDatabase.bookList.add(bookTwo);    
                        bookDatabase.bookList.add(bookThree);    
                        bookDatabase.bookList.add(bookFour);    
                        bookDatabase.bookList.add(bookFive);    
                        bookDatabase.bookList.add(bookSix);    
                        
                         //Print the menu
                         String mainMenu = ("Select a choice from the menu: \n"
                                 + "1. Create a New Book Entry\n"
                                 + "2. Search By Book SKU:\n"
                                 + "3. Search By Book Auothor Name:\n"
                                 + "4. Search By Book Categories:\n"
                                 + "5. Exit");   
                         System.out.println(mainMenu);
                         choice=scan.nextInt();
                         scan.nextLine();
                         //check the choice is there between this two value
                         while (choice < 1 || choice > 5) {
                             System.out.print("\nError! Your Choice Enter is wrong please try to enter the corect one that is 1,2,3,4 and 5!!!\");");
                             System.out.println(mainMenu);
                             choice=scan.nextInt();
                             scan.nextLine();
                         }
                        
                          switch (choice){
                             case 1:                                      
                            	 bookDatabase.addBook();                          
                                 break;
                             case 2:

                            	 System.out.println("Enter SKU of a Book to See:");
                                 sku=scan.nextLine();
                                 book.setSKU(sku);

                                 bookDatabase.searchBySku(bookList, sku);
                                 break;
                                
                             case 3:
                                
                                 System.out.println("Search Book By Book Author Name:");   
                                 String authorFind=scan.nextLine();
                                 scan.nextLine();
                                 bookDatabase.searchByAuthor(bookList, authorFind);
                                 
                                 break;
                                                    
                             case 4:                   
                                     System.out.println("Search Book By Book Categories:");   
                                     String catagFind=scan.nextLine();
                                     scan.nextLine();
                                     bookDatabase.searchByCategories(bookList, catagFind);
                                     break;   
                          case 5:
                                 System.exit(0);
                             break;   
                      }
                 while(choice!=5);      
		        
	}

}
