package collectionswithuserdefinedobjects;

public class Student implements Comparable<Student> {
	private int studentId;
	private String studentName;
	private Float studentMarks;
	
	public Student() {
		System.out.println("default constructor");
	}
	
	

	public Student(int studentId, String studentName, Float studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Float studentMarks) {
		this.studentMarks = studentMarks;
	}

	
	  @Override 
	  public String toString() { 
		  return "Student [studentId=" + studentId
	  + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]"; 
		  }


	  
	  
	  
	  

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		result = prime * result + ((studentMarks == null) ? 0 : studentMarks.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		if (studentMarks == null) {
			if (other.studentMarks != null)
				return false;
		} else if (!studentMarks.equals(other.studentMarks))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}



	@Override
	public int compareTo(Student st) {
		if(studentMarks ==  st.getStudentMarks())
		return 0;
		else if(studentMarks> st.getStudentMarks())
			return 1;
		else
			return -1;
	}



	/*
	 * @Override public int compareTo(Student st1) { // TODO Auto-generated method
	 * stub return studentName.compareTo(st1.getStudentName()); }
	 */
	 
	

}
