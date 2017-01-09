package design.pattern.templatemethod;

public class Main {
	
	public static void main(String[] args) {
		AbstractDisplay ad1 = new CharDisplay('H');
		AbstractDisplay ad2 = new StringDisplay("This is Templete Method.");
		AbstractDisplay ad3 = new StringDisplay("템플릿 메서드 패턴");
		
		ad1.display();
		
		ad2.display();
		
		ad3.display();
	}

}
