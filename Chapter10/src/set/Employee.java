package set;

public class Employee {
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + ", " + empName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			if(this.empId == employee.empId)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return empId;
	}
}
