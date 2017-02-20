package design.pattern.iterator;

public class Main {
	
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(6);
		bookShelf.appendBook(new Book("나의 라임오렌지나무"));
		bookShelf.appendBook(new Book("어린왕자"));
		bookShelf.appendBook(new Book("연을 쫓는 아이"));
		bookShelf.appendBook(new Book("사람은 무엇으로 사는가"));
		bookShelf.appendBook(new Book("동물 농장"));
		bookShelf.appendBook(new Book("1Q84"));
		
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
	}

}
