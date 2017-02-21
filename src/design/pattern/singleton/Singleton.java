package design.pattern.singleton;

/**
 * 클래스의 인스턴스가 하나만 필요할 경우가 있다. 1개밖에 존재하지 않는 것을 프로그램으로
 * 표현하고 싶을 때로 예를 들면 컴퓨터 자체를 표현한 클래스, 
 * 현재의 시스템 설정을 표현한 클래스, 윈도우 시스템을 표현한 클래스 등이다.
 * 
 * 지정한 클래스의 인스턴스가 '절대로' 1개만 존재해야 한다는 것을 '보증' 하고 싶을 때
 * 인스턴스가 1개밖에 존재하지 않는 것을 프로그램 상에서 표현하고 싶을 때
 */
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("Created Instance");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

}
