package design.pattern.prototype;

/**
 * Prototype 패턴
 * 
 * 1. 종류가 너무 많아 클래스로 정리되지 않을 경우
 * 2. 클래스로부터 인스턴스 생성이 어려운 경우
 * 3. Framework와 생성할 인스턴스를 분리하고 싶은 경우
 */
public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		UnderlinePen upen = new UnderlinePen('~');
		
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash message", sbox);
		
		Product p1 = (Product) manager.create("strong message");
		p1.use("Hello, world.");
		
		Product p2 = manager.create("warning message");
		p2.use("Hello, world.");
		
		Product p3 = manager.create("slash box");
		p3.use("Hello, world.");
		
	}
	
}
