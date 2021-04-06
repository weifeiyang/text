package text6;

public class Subject {

	private String ID;
	private String Name;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Subject(String iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	@Override
	public String toString() {
		return "学科号："+ID+"学科名："+Name;
	}
	

}
