package design.pattern.adapter.case2;

/**
 * Target Interface
 * 
 * Adapter가 구현하는 인터페이스이다.
 * Client는 이를 통해 Adaptee(서드파티)를 사용할 수 있다.
 */
public interface TargetInterface {
	
	void requestHandler();

}
