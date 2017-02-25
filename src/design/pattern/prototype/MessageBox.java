package design.pattern.prototype;

public class MessageBox implements Product {
	
	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		
		int length = s.getBytes().length;
		
		for (int i=0; i<length+4; i++) {
			System.out.print(decochar);
		}
		
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		
		for (int i=0; i<length+4; i++) {
			System.out.print(decochar);
		}
		
		System.out.println("");
	}
	
	/**
	 * java.lang.Cloneable 인터페이스 구현 클래스
	 * clone() 메서드는 Java 언어 사양에 규정되어 있으며, 자기자신의 복제를 생성하는 메서드
	 */
	@Override
	public Product createClone() {
		
		Product p = null;
		
		try {
			p = (Product) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	
}
