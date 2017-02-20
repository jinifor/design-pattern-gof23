package design.pattern.iterator;

/**
 * 서가를 검색하는 클래스
 */
public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;

	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		Book book = bookShelf.getBookAt(index);
		index++;

		return book;
	}


}
