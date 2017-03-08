package design.pattern.builder;

public class Main {

	public static void main(String[] args) {

		if (args.length != 1) {
			usage();
			System.exit(0);
		}


		if (args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			
			Director director = new Director(textbuilder);
			director.construct();
			
			String result = textbuilder.getResult();
			System.out.println(result);

		} else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			
			String filename = htmlbuilder.getResult();
			System.out.println(filename + "가 작성되었습니다.");

		} else {
			usage();
			System.exit(0);
		}

	}

	public static void usage() {
		System.out.println("Usage : java main plain 일반 텍스트로 문서 작성");
		System.out.println("Usage : java main html  HTML 파일로 문서 작성");
	}

}
