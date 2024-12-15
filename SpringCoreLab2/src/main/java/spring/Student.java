package spring;

public class Student {
	
	private String sname;
	private int sage;
	private float sfees;
	
	//public Student() {
		//super();
		// TODO Auto-generated constructor stub
	//}

	public Student(String sname, int sage, float sfees) {
		//super();
		this.sname = sname;
		this.sage = sage;
		this.sfees = sfees;
	}
// get set method is optional
	/* public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public float getSfees() {
		return sfees;
	} 

	public void setSfees(float sfees) {
		this.sfees = sfees;
	} */

	public void display() {
		System.out.println("Hello "+sname);
		System.out.println("Age="+sage);
		System.out.println("Fees= "+sfees);
	}

}