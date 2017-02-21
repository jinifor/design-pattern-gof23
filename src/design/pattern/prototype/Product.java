package design.pattern.prototype;

/**
 * 복제가 가능하도록 java.lang.Cloneable 메서드 사용
 */
public interface Product extends Cloneable {

	public abstract void use(String s);

	public abstract Product createClone();

}
