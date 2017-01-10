package design.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Start...");
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		
		if (obj1 instanceof Singleton) {
			System.out.println("obj1은 Singleton 인스턴스입니다.");
		}
		
		if (obj2 instanceof Singleton) {
			System.out.println("obj2은 Singleton 인스턴스입니다.");
		}
		
		if (obj1 == obj2) {
			System.out.println("obj1 과 obj2는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1 과 obj2는 서로 다른 인스턴스입니다.");
		}
		
		System.out.println("End...");
	}

}
