package design.pattern.factorymethod.Anonymous;

import design.pattern.factorymethod.framework.Factory;
import design.pattern.factorymethod.framework.Product;
import design.pattern.factorymethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("스테파니");
		Product card2 = factory.create("클로이");
		Product card3 = factory.create("안젤라");
		
		card1.use();
		card2.use();
		card3.use();
	}

}
