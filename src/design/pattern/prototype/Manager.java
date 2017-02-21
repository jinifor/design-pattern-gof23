package design.pattern.prototype;

import java.util.HashMap;

import design.pattern.factorymethod.framework.Product;

public class Manager {

	private HashMap<String, Product> showcase = null;
	
	public Manager() {
		showcase = new HashMap<String, Product>();
	}


	public void register(String name, Product proto) {
		showcase.put(name,  proto);
	}

	public Product create(String protoname) {
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}

}
