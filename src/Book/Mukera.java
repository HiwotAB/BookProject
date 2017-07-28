package Book;


	import java.util.ArrayList;
	import java.util.Scanner;



	public class Mukera {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			// Identifier declaration 	
			
			boolean toContinue=true;
			String selContinue;				
			String bookTitle; 
			String bookAuthor;
			String bookDescr;
			double bookPrice;
			String SKU;
					
			//Declare an array list variable and Initialize the array list  and type of array list that is class
			ArrayList<Book> bookList=new ArrayList<Book>();
			
			System.out.println("Enter One of the following choice:");
			System.out.println("1-Create a New Book Entry");
			System.out.println("2-Review Book Enteries Data");
			//System.out.println("3-Exit");
			Scanner scanChoice=new Scanner (System.in);
			System.out.println();
			System.out.println("Enter Your Choice:- \"1\",\"2\"");
			int choice=scanChoice.nextInt();
			while(choice!=3){
				if(choice<1||choice>2)
				{
					System.out.println("Your Choice Enter is wrong please try to enter the corect one that is 1 or 2!!!");
				}
				else if(choice==1){
					do{
						
						
						Book book=new Book();			
						
						System.out.println("Enter Book SKU:");
						SKU=scan.nextLine();
						book.setSKU(SKU);
						
						System.out.println("Enter Book Tiltle:");
						bookTitle=scan.nextLine();
						book.setBookTitle(bookTitle);
						
						System.out.println("Enter Book Author:");
						bookAuthor=scan.nextLine();
						book.setBookAuthor(bookAuthor);
						
						System.out.println("Enter Book Description:");
						bookDescr=scan.nextLine();
						book.setBookDescr(bookDescr);
						
						System.out.println("Enter Book Price:");
						bookPrice=scan.nextDouble();
						book.setBookPrice(bookPrice);					
						
						
						
						//Add to myArrayList 
						bookList.add(book);
						
									
					
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
							/*
							for(Book data:bookList) {		
								System.out.println("Review existing Books Data");		
								System.out.println("SKU: "+data.getSKU());
								System.out.println("Book Title: "+data.getBookTitle());
								System.out.println("Book Author Name: "+data.getBookAuthor());
								System.out.println("Book Description: "+data.getBookDescr());
								System.out.println("Book Price: "+data.getBookPrice());
								
							}*/
							
						}
						
					}while(toContinue==true);
				}
				
					else if(choice==2){
							
					System.out.println("Enter SKU of a Book to See:");	
					String SKUFind=scan.nextLine();
					scan.nextLine();
					 
					for(Book data:bookList) {				
						
						if(data.getSKU().equalsIgnoreCase(SKUFind)){
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
					
				}
			}
		}
	}
			
			
			
		