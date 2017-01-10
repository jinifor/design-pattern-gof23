package design.pattern.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import design.pattern.factorymethod.framework.Factory;
import design.pattern.factorymethod.framework.Product;

/**
 * 메서드 createProduct, registerProduct를 구현하고 있는 클래스
 * 
 */
public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();

	/**
	 * IDCard의 인스턴스 생성하여 제품을 만드는 일을 실행
	 */
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	/**
	 * IDCard의 owner를 owners 필드에 추가하는 등록 기능을 실행
	 */
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}

}
