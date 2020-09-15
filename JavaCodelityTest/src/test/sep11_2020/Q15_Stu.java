package test.sep11_2020;

public class Q15_Stu implements Comparable<Q15_Stu>{
	private String studentName;
	private int studentRegNo;
	
	public Q15_Stu(String studentName, int studentRegNo) {
		super();
		this.studentName = studentName;
		this.studentRegNo = studentRegNo;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRegNo=" + studentRegNo + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(int studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	

	@Override
	public int compareTo(Q15_Stu o) {
		// TODO Auto-generated method stub
		return this.studentRegNo-o.studentRegNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentRegNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q15_Stu other = (Q15_Stu) obj;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentRegNo != other.studentRegNo)
			return false;
		return true;
	}
}
