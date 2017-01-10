package design.pattern.factorymethod.idcard;

import design.pattern.factorymethod.framework.Product;

/**
 * 메서드 use를 구현하고 있는 클래스
 * 
 * Product 추상 클래스를 상속받은 IDCard 클래스에서 use() 메서드를 구현
 */
public class IDCard extends Product {

	private String owner;

	public IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");
	}

	public String getOwner() {
		return owner;
	}

}
