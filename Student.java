package text6;

public class Student {
   private String ID;
   private String Name;
public Student(String iD, String name) {
	super();
	ID = iD;
	Name = name;
}
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
@Override
public String toString() {
	return ID+"\t"+Name;
}
   
   
}
