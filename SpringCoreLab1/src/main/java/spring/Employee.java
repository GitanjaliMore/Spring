package spring;

public class Employee {
	
	private String ename;
	
	
	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public void display() {
		   System.out.println("Hello My First Spring Application " +ename);
   }
	
	}



