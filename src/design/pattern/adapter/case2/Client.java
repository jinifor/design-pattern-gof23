package design.pattern.adapter.case2;

public class Client {

	private TargetInterface webRequester;

	public Client(TargetInterface webRequester) {
		this.webRequester = webRequester;
	}

	// WebRequester 인터페이스 구현한 클래스의 requestHandler() 메소드를 호출하여 동작
	public void doWork() {
		webRequester.requestHandler();
	}
	
}
