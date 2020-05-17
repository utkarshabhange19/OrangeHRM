
public class Employ {
	private int empid;
	private String empname;
	private String companyname;

	public Employ(int empid2, String empname2, String comapnyname) {
		this.empid = empid;
		this.empname = empname;
		this.companyname = companyname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@Override
	public String toString() {
		return "Employ [empid=" + empid + ", empname=" + empname + ", companyname=" + companyname + "]";
	}

}
