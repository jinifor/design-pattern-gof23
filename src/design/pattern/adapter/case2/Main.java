package design.pattern.adapter.case2;

public class Main {
	
	public static void main(String[] args) {
		
		Client client = null;
		
		Adapter adapter = new Adapter(new Adaptee());
		
		client = new Client(adapter);
		client.doWork();
		
		AdapterDog adapterDog = new AdapterDog(new AdapteeDog());
		client = new Client(adapterDog);
		client.doWork();
		
	}

}
