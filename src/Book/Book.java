package Book;

public class Book {

	String bookTitle;
	String bookAuthor;
	String bookDescr;	
	double bookPrice;
	String SKU;
	
	
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
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	@Override
	public String toString() {
		return "\n Book Title=" + bookTitle +"\nBook Author=" + bookAuthor + 
				"\n Book Description=" + bookDescr
				+ "\n Book Price=" + bookPrice +"\n Book SKU=" + SKU + "";
	}
	
	
	
}
