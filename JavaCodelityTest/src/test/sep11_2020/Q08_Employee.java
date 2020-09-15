package test.sep11_2020;

public class Q08_Employee {
	 private int employeeId; 
	    private String employeeName;
	    public Q08_Employee(int employeeId, String employeeName) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	    }
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof Q08_Employee) {
	            return ((Q08_Employee) obj).employeeId == employeeId;
	        }
	        return false;
	    }
	    @Override
	    public int hashCode() {
	        return this.employeeId;
	    }

}
