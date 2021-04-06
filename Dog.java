package text5;

public class Dog {

	private String name;
	private String color;
	private String ages;
	public Dog(String name, String color, String ages) {
		super();
		this.name = name;
		this.color = color;
		this.ages = ages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAges() {
		return ages;
	}
	public void setAges(String ages) {
		this.ages = ages;
	}
	@Override
	public String toString() {
		return name+color+ages;
	}
	
}
