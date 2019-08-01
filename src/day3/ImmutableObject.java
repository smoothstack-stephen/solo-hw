package day3;

public class ImmutableObject {

	private String name;
	private int value;
	
	public ImmutableObject(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getValue() {
		return this.value;
	}
}
