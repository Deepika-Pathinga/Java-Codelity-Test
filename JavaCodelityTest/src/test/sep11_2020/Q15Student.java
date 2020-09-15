package test.sep11_2020;



public class Q15Student implements Comparable<Q15Student> {
	private String name; 
    private Long id; 
          
    // A parameterized student constructor 
    public Q15Student(String name, Long id) { 
      
        this.setName(name); 
        this.setId(id); 
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	

    
	 @Override
	    public int compareTo(Q15Student s) {
	        return this.getId().compareTo(s.getId());
	    }

@Override
public String toString() {
 return "Student{" +
         "name='" + name + '\'' +
          ", id=" + id +
          '}';
}
}