package Book;

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
	
	

