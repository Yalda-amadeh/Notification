package notification;

public class Student extends AbstractNotify {
	private int studentid;
	
	public Student(String name, int age,int studentid) {
		super(name, age);
		this.studentid=studentid;
	}

	@Override
	public String awake() {
	    if (studentid == 3) {
	        return "SMS"; 
	    } else {
	        return "No message"; 
	    }
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	}