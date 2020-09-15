package test.sep11_2020;

public class Q02_Student {
	
	private int id;
	private String name;
	private Long marks;

	public Q02_Student(int id, String name, Long marks) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

}
