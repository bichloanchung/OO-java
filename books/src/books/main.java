package books;
/*
 * Exercise 14
 */
public class main {

	public static void main(String[] args) {
		book b1 = new book("pls1",2000,"Lina");
		book b2 = new book("pls2",2001,"Lina");
		book b3 = new book("pls3",2005,"Lina");
		book b4 = new book("pls1",2000,"Hugo");
		book b5 = new book("pls5",2006,"Hugo");
		book b6 = new book("pls1",2000,"Hugo");
		book b7 = new book("pls8",2008,"Vitor");
		book b8 = new book("pls7",2008,"Swiss");
		System.out.println(book.numberOfBooks);

	}

}
