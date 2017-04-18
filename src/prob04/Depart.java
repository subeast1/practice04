package prob04;

public class Depart extends Employee {
	private String departmentName;

	public Depart( String name, int salary, String departmentName ) {
		super( name, salary );
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public void getInformation() {
		System.out.println( 
			"이름:" + getName() + 
			" 연봉:" + getSalary() + 
			" 부서:" + departmentName );
	}
}
