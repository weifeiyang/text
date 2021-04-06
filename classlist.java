package text6;

public class classlist {
	private String semester;
	private String year;
	private Subject subj;
	private Student s1;
	private Student s2;
	public classlist(String semester, String year, Subject subj, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.subj = subj;
		this.s1 = s1;
		this.s2 = s2;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public Student getS2() {
		return s2;
	}
	public void setS2(Student s2) {
		this.s2 = s2;
	}
	@Override
	public String toString() {
		String info="";
		info=year+"年"+semester+"学期"+"\n";
		info+=this.subj.toString()+"\n";
		info+="学号"+"\t"+"姓名"+"\n";
		info+=this.s1.toString()+"\n";
		info+=this.s2.toString()+"\n";
		return info;
		
	}
	
	

}
