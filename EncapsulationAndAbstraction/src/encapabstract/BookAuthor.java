package encapabstract;

public class BookAuthor {
public static void main(String args[])
{
	Author author = new Author(" sony", "sony@yahoo.com", 'f');
	Book book = new Book("Java Fundamentals", author, 160, 200);
	
	System.out.println(book);
}
}
