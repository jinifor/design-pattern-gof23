package design.pattern.adapter.case1;

/**
 * 교환장치
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithAster();
	}

	@Override
	public void printStrong() {
		showWithParen();
	}
}
