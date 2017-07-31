package Book;
/**
 * This is a class that functions as a 'shopping cart', holding products
 * before an invoice is generated. It contains an arraylist of products
 * which is instantiated when an object of the ProductList class is created.
 * It also has a method called add so that individual product items can be
 * added to the list.
 * The getter method returns an entire object with all of the contents of the
 * arraylist.
 * The setter method stores an entire object with all of the contents of the
 * arraylist.
 * */
public class Book {


    String SKU;
    String bookTitle;
    String bookAuthor;
    String bookCategories;
    String bookDescr;   
    double bookPrice;
       
	    public Book(){
	    
	    }
    	public Book(String sku,String title,String author,String cate,String desc,double price){
    		this.SKU=sku;
    		this.bookTitle=title;
    		this.bookAuthor=author;
    		this.bookCategories=cate;
    		this.bookDescr=desc;
    		this.bookPrice=price;
    		
    	}
   
        public String getSKU() {
            return SKU;
        }
        public void setSKU(String sKU) {
            SKU = sKU;
        }
        public String getBookTitle() {
            return bookTitle;
        }
        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;   
           
        }
        public String getBookAuthor() {
            return bookAuthor;
        }
        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }
        public String getBookCategories() {
            return bookCategories;
        }
        public void setBookCategories(String bookCategories) {
            this.bookCategories = bookCategories;
        }
        public String getBookDescr() {
            return bookDescr;
        }
        public void setBookDescr(String bookDescr) {
            this.bookDescr = bookDescr;
        }
        public double getBookPrice() {
            return bookPrice;
        }
        public void setBookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
        }
       
        @Override
        public String toString() {
            return "\nBook" +
                    "\nBook SKU=" + SKU +
                    "\nBook Title=" + bookTitle +
                    "\nBook Author=" + bookAuthor +
                    "\nBook Categories=" + bookCategories +
                    "\nBook Description=" + bookDescr +
                    "\nBook Price=" + bookPrice;
            }


}
	
	

