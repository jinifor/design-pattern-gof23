package design.pattern.factorymethod.framework;

/**
 * 메서드 create를 구현하고 있는 추상 클래스
 */
public abstract class Factory {

	/**
	 * 
	 * @param owner
	 * @return
	 */
	public final Product create(String owner) {
		
		Product product = createProduct(owner);
		registerProduct(product);

		return product;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);

}
