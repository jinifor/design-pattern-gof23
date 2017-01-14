package design.pattern.adapter.case1;

public class Main {

	public static void main(String[] args) {
		
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
		PrintBanner pp = new PrintBanner("크하하");
		pp.printWeak();
		pp.printStrong();
	}

}
