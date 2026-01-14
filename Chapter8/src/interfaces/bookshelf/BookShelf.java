package interfaces.bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQuee(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return shelf.size();
	}
}
