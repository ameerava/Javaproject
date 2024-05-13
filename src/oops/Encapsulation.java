package oops;

class Encap{
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Encap ob=new Encap();
		ob.setEmpid(101);
		ob.setEmpname("ameera");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());
	}

}
