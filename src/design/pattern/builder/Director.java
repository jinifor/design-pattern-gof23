package design.pattern.builder;

/**
 * 한 개의 문서를 만드는 클래스.
 * Builder 클래스에 선언되어 있는 메서드를 사용하여 작성됨.
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Gretting");
		builder.makeString("아침인사");
		builder.makeItems(new String[] {
				"굿 모닝",
				"하이루~"
		});
		builder.makeString("밤에");
		builder.makeItems(new String[] {
				"하이",
				"굿나잇",
				"굿바이"
		});
		builder.close();
	}

}
