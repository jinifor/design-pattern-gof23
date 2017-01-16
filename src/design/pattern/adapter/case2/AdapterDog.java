package design.pattern.adapter.case2;

/**
 * Adapter
 */
public class AdapterDog implements TargetInterface {
	
	private AdapteeDog adaptee;
	
	public AdapterDog(AdapteeDog adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void requestHandler() {
		adaptee.speakDog();
	}

}
