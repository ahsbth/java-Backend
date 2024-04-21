package inheritence;

public class InventrySystem {

	public static void main(String[] args) {

		Book b=new Book("java","EBalagurusamay",500d);
		b.show();
		Ebook eb=new Ebook();
		eb.downloadLink("www.javadoc.com");
		
	}

}
class Book{
	String author;
	String title;
	double price;
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
class Ebook{
	public void downloadLink(String link) {
		System.out.println(link);
	}
}