package design.pattern.builder;

/**
 * 일반 텍스트를 이용하여 문서를 만드는 클래스.
 * 보통의 문자열을 입력 
 */
public class TextBuilder extends Builder {
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append("==============================\n");
		buffer.append("[");
		buffer.append(title);
		buffer.append("]");
		buffer.append("\n"); // 빈 행
	}

	@Override
	public void makeString(String str) {
		buffer.append("*"); // 글머리 기호
		buffer.append(str);
		buffer.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		
		for (int i=0; i<items.length; i++) {
			buffer.append("  -"); // 글머리 기호
			buffer.append(items[i]);
			buffer.append("\n");
			buffer.append("\n");
		}
	}

	@Override
	public void close() {
		buffer.append("==============================\n");
	}
	
	public String getResult() {
		return buffer.toString();
	}
	
}
