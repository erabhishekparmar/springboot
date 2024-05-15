package collections;

public class Book implements Comparable<Book> {

	String name;
	String author;
	int price;
	
	@Override
	public int compareTo(Book o) {
		return this.price-o.price;
	}

	public Book(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	
	
	
	
}
