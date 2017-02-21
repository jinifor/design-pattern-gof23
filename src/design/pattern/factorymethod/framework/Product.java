package design.pattern.factorymethod.framework;

/**
 * 추상 메서드 use만 정의한 추상 클래스
 * 구체적인 구현은 Product 하위 클래스에서 진행
 */
public abstract class Product {
	
	public abstract void use();

	public abstract Product createClone();

}
