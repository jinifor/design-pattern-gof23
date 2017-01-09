package design.pattern.templatemethod;

/**
 * 템플릿에 해당하는 메서드가 정의되어 있음
 * 추상 메서드를 하위 클래스에서 구현하여 구체적인 처리가 결정됨
 */
public abstract class AbstractDisplay {

	// 하위 클래스에 구현을 맡기는 추상 메서드(1) open
	public abstract void open();

	// 하위 클래스에 구현을 맡기는 추상 메서드(2) print
	public abstract void print();

	// 하위 클래스에 구현을 맡기는 추상 메서드(3) close
	public abstract void close();

	// 추상 클래스에서 구현되고 있는 메서드 display
	public final void display() {

		open();

		for (int i=0; i<5; i++) {
			print();
		}

		close();
	}

}
