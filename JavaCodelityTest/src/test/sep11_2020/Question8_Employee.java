package test.sep11_2020;

public class Question8_Employee {
	 private int employeeId; 
	    private String employeeName;
	    public Question8_Employee(int employeeId, String employeeName) {
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
	        if (obj instanceof Question8_Employee) {
	            return ((Question8_Employee) obj).employeeId == employeeId;
	        }
	        return false;
	    }
	    @Override
	    public int hashCode() {
	        return this.employeeId;
	    }

}
