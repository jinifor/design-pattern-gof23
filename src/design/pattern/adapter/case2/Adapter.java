package design.pattern.adapter.case2;

/**
 * Adapter
 * 
 * Client와 Adaptee 중간에서 서로 연결시켜 주는 역할을 담당한다.
 * TargetInterface의 구현체로 어댑터에 요청을 보낸다.
 */
public class Adapter implements TargetInterface {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void requestHandler() {
		adaptee.adapteeHandler();
	}

}
