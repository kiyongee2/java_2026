package interfaces.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		
		//자료 삽입
		shelfQueue.enQuee("반응형 웹");
		shelfQueue.enQuee("혼공 Java");
		shelfQueue.enQuee("스프링부트");
		
		//자료의 개수
		System.out.println(shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
